package facades;

import dtos.PersonDTO;
import entities.Person;
import entities.Phone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class PersonFacade {
    private static PersonFacade instance;
    private static EntityManagerFactory emf;

    private PersonFacade(){

    }

    public static PersonFacade personFacade(EntityManagerFactory _emf){
        if(instance == null){
            emf = _emf;
            instance = new PersonFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager(){return emf.createEntityManager();}




    public static PersonDTO getPersonById(Integer id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class,id);
        em.getTransaction().commit();
        em.close();

        if(person!=null){
            return new PersonDTO(person);
        }else{
            return null;
        }
    }

    public static PersonDTO getPersonByPhone(List<Phone> phone){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class,phone);
        em.getTransaction().commit();
        em.close();

        if(person != null){
            return new PersonDTO(person);
        }else{
            return null;
        }
    }

    public PersonDTO createPerson(PersonDTO person){
        Person person1 = new Person(person.getEmail(),person.getFirstName(),person.getLastName());
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(person1);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
        return new PersonDTO(person1);
    }


    @SuppressWarnings("unchecked")
    public PersonDTO editBasicInfo(PersonDTO personDTO){
        EntityManager em = emf.createEntityManager();

        try {
            Person updated = em.find(Person.class, personDTO.getId());
            em.getTransaction().begin();
            updated.setFirstName(personDTO.getFirstName());
            updated.setLastName(personDTO.getLastName());
            updated.setPhones(personDTO.getPhones());
            updated.setEmail(personDTO.getEmail());
            updated.setAge(personDTO.getAge());
            em.getTransaction().commit();
            return new PersonDTO(updated);
        }finally {
            em.close();
        }
    }


    public Integer getPersonCount(){
        EntityManager em = emf.createEntityManager();
        try{
            Integer personCount = (Integer)em.createQuery("SELECT COUNT(p) FROM Person p").getSingleResult();
            return personCount;
        }finally{
            em.close();
        }
    }

    public List<PersonDTO> getAll(){
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> persons = query.getResultList();
        return PersonDTO.getPersonDtos(persons);
    }




}

//Person updated = em.find(Person.class, personDTO.getId());
//updated.setFirstName(personDTO.getFirstName());

/*

    @SuppressWarnings("unchecked")
    public List<DTOMovie> getMoviesByName(String title) throws Exception{
        EntityManager em = emf.createEntityManager();
            try{
                em.getTransaction().begin();
                TypedQuery<Movie> typedQuery = em.createQuery("SELECT m FROM Movie m WHERE m.title=:title",Movie.class);
                typedQuery.setParameter("title",title);
                List<Movie> result = typedQuery.getResultList();
                em.getTransaction().commit();
                return (List<DTOMovie>) (List<?>) result;
            } finally {
                emf.close();
                em.close();

            }
    }

 */