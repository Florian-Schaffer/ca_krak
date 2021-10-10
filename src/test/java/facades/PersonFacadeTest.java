package facades;

import dtos.Hobbies.HobbyDTO;
import dtos.Person.PersonDTO;
import dtos.Phone.PhoneDTO;
import entities.*;
import org.junit.jupiter.api.*;
import utils.EMF_Creator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonFacadeTest {
    private static EntityManagerFactory emf;
    private static PersonFacade facade;
    private static Person person1, person2;

    @BeforeAll
    public static void setUpClass(){
        emf = EMF_Creator.createEntityManagerFactoryForTest();
        facade = PersonFacade.getInstance(emf);
    }

    @AfterAll
    public static void tearDownClass(){

    }

    //setup
    @BeforeEach
    public void setUp(){

        CityInfo cityInfo = new CityInfo(3000,"TestCity");

        person1 = new Person("Testmail@hotmail.com","TestFirstName","TestLastName");
        Phone phone1 = new Phone("12345678","TestPhone");
        person1.addPhone(phone1);
        Hobby hobby = new Hobby("Turisme","https://da.wikipedia.org/wiki/Turisme","General","Fritid");
        person1.addHobby(hobby);
        Address address1 = new Address("Testgade 1", "Test street");
        address1.setCityInfo(cityInfo);
        person1.setAddress(address1);


        person2 = new Person("Testmail@gmail.com","TestFirstName","TestLastName");
        Phone phone2 = new Phone("09101112","TestPhone");
        person2.addPhone(phone2);
        person2.addHobby(hobby);
        Address address2 = new Address("Testgade 2", "Test street");
        address1.setCityInfo(cityInfo);
        person2.setAddress(address2);


        Hobby newHobby = new Hobby("Swimming", "https://da.wikipedia.org/wiki/Swimming","Waterbased","Competition");

        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();

            em.createNamedQuery("Phone.deleteAllRows").executeUpdate();
            em.createNamedQuery("Hobby.deleteAllRows").executeUpdate();
            em.createNamedQuery("Person.deleteAllRows").executeUpdate();
            em.createNamedQuery("Address.deleteAllRows").executeUpdate();
            em.createNamedQuery("CityInfo.deleteAllRows").executeUpdate();

            em.persist(cityInfo);
            em.persist(hobby);
            em.persist(newHobby);
            em.persist(person1);
            em.persist(person2);

            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }


    @AfterAll
    static void tearDownAll(){
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.createNamedQuery("Hobby.deleteAllRows").executeUpdate();
            em.createNamedQuery("Phone.deleteAllRows").executeUpdate();
            em.createNamedQuery("Person.deleteAllRows").executeUpdate();
            em.createNamedQuery("Address.deleteAllRows").executeUpdate();
            em.createNamedQuery("CityInfo.deleteAllRows").executeUpdate();
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    @AfterEach
    public void tearDown(){

    }

    @Test
    public void getAllPersonsTest(){
        int expected = 2;
        int actual = facade.getAll().getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getPersonByIdTest(){
        String expected = "TestFirstName";
        String actual = facade.getPersonById(person1.getId()).getFirstName();
        assertEquals(expected, actual);
    }

    @Test
    public void getPersonsByHobbyTest(){
        int expected = 2;
        int actual = facade.getPersonsByHobby("Turisme").getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void getPersonCountByHobbyTest(){
        int expected = 2;
        int actual = facade.getNumberOfPeopleByHobby("Turisme");
        assertEquals(expected, actual);
    }

    @Test
    public void getPersonsByCityTest(){
        int expected = 2;
        int actual = facade.getPersonbyCity(3000).getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void addPersonTest(){
        PersonDTO p;
        Person person = new Person("Testmail@mail.com","TestFirstName","TestLastName");
        Phone phone = new Phone("54347892","TestPhone");
        person.addPhone(phone);
        Hobby hobby = new Hobby("Turisme","https://da.wikipedia.org/wiki/Turisme","General","Fritid");
        person.addHobby(hobby);
        Address address = new Address("Testgade 3","This is a street");
        address.setCityInfo(new CityInfo(3000,"TestCity"));
        person.setAddress(address);

        PersonDTO createdPerson = new PersonDTO(person);

        p = facade.createPerson(createdPerson);

        for (HobbyDTO hobbyDTO:p.getHobby()){
            assertNotNull(hobbyDTO);
        }

        for(PhoneDTO phoneDTO : p.getPhones()){
            assertNotNull(phoneDTO);
        }

        assertEquals("Testmail@mail.com",p.getEmail());
        assertEquals("Testgade 3", createdPerson.getAddress().getStreetName());

        assertEquals(3, facade.getAll().getSize());
    }


    @Test
    public void editPersonTest(){
        person1.setLastName("Jense");
        person1.addPhone(new Phone("12444666","This phone has been edited"));
        Hobby newHobby = new Hobby("Swimming", "https://da.wikipedia.org/wiki/Swimming","Waterbased","Competition");
        person1.addHobby(newHobby);
        Address newAddress = new Address("Testgade 4", "Villavej");
        newAddress.setCityInfo(new CityInfo(3000,"TestCity"));
        person1.setAddress(newAddress);
        PersonDTO editedPerson = new PersonDTO(person1);
        facade.editPerson(editedPerson);

        assertEquals("Jensen",editedPerson.getLastName());
        assertEquals(2,editedPerson.getPhones().size());
        assertEquals(2,editedPerson.getHobby().size());


        for(int i=0; i<editedPerson.getHobby().size();i++){
            assertEquals(newHobby.getName(),editedPerson.getHobby().get(i).getName());
        }

        assertEquals(newAddress.getStreetName(),editedPerson.getAddress().getStreetName());
    }




}
