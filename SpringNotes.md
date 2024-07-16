
# SpringBoot Overview

## Spring Framework

Spring Framework is built on the principle of Inversion of Control and the pattern of dependency injection.

### Key Components

- **SpringApplication.run**: This method returns a context object through which instances can be accessed from the main class.

### Annotations

- **@Component**: Indicates to the framework that the class is a bean, or to create the instance of the class.
- **@Autowired**: Indicates to the framework to wire or connect the classes, i.e., caller class and called class. There are three ways to wire:
  - Field injection 
  - Constructor injection (default, no need to write annotations)
  - Setter injection
- **@Primary**: Indicates to the framework to consider the bean as higher priority when more than one bean of the same type is found.
- **@Qualifier**: Indicates to the framework to take the instance mentioned in the annotation, using the class name without a capital letter.

### Spring Framework Manual Configurations

- All configurations need to be done manually.
- Configuration files are in the resources.
- Create `ApplicationContext` instance in multiple ways, e.g., `ClassPathXmlApplicationContext`.
- For every component class created, add a bean tag in the configuration file.
- Inject properties through setter injection or constructor injection within configuration files.

## Spring Boot WebApp

Follows Spring MVC architecture.

### Controllers

- **Controller**: A special type of class responsible for receiving web requests and returning appropriate data.
  - **@Controller**: Annotation on class indicating it's a controller.
  - **@RestController**: Replaces `@Controller`, indicating the method returns a file and searches for the file to return.
  - **@ResponseBody**: Annotation on method, used instead of `@RestController` to indicate the method returns the body, not the file name.
  - **@RequestMapping**: Maps a request of specific URL to the method, used on methods. Can pass methods as second argument.
  - **@GetMapping**: Replaces `@RequestMapping` to map request directly to GET method.
  - **@PostMapping**: Similar to `@GetMapping` but used for POST method.
  - **@RequestBody**: Maps the request body to the argument in the controller method, used on method argument.
  - **@PathVariable**: Maps the argument in the controller method with the path variable.

### Services and Repositories

- **@Service**: Indicates the given class is a service class.
- **@Repository**: Indicates the given class/interface is a repository.
- **@Entity**: Makes a given class an entity for JPA to create an ORM.
- **@Id**: Indicates a field as the primary key.
- **@GeneratedValue**: Used in model class to auto-generate the ID.
- **@CrossOrigin**: Prevents CORS errors, used on controller class.

### Other Key Concepts

- **FrontController**: An internal controller provided by the framework that enables multiple controllers in an application.
- **JPA**: Java Persistence API, a standard implemented by ORM.
- **ORM**: Object Relational Mappings, tools include Hibernate, Eclipse Link, Mybatis.

### JPA Points to Remember

- A repository layer can be an interface extending the `JPARepository` interface, requiring two arguments: the entity and the primary key data type.

### Basic Property Variables

- `spring.datasource.url=`
- `spring.datasource.driver-class-name=`

### Optional Properties

- `spring.datasource.username=`
- `spring.datasource.password=`
- `spring.jpa.hibernate.ddl-auto=`
- `spring.jpa.defer-datasource-initialization=`
- `spring.jpa.show-sql=`

### ResponseEntity

- **ResponseEntity<T>**: Used to send the complete response data back to the client.

### Additional Concepts

- **MultiFilePart**
- **RequestPart**
- **JPQL (JPA Query Language @Query)**
