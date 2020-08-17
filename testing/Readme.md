# jUnit4 Notes

## What is jUnit

jUnit is a unit testing framework that is used widely by java programmers.


Some important thins to keep in mind while working with jUnit.

Setting jUnit in maven pom.xml.

```XML
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
    </dependency>
```

### Creating a new maven project for junit testing

```Maven
mvn org.apache.maven.plugins:maven-archetype-plugin:3.1.2:generate       
-DarchetypeArtifactId="maven-archetype-quickstart" -DarchetypeGroupId="org.apache.maven.archetypes" -DarchetypeVersion="1.4"
```

## Testing methods

Some of the most commonly used methods in jUnit

- assertArrayEquals()
- assertEquals()
- assertNull()
- assertNotNull()
- assertTrue()
- assertFalse()
- assertSame()
- assertNotSame()
- fail()

## Commonly used annotations and their usage     


***


### @Test  


This annotation is used to mark a unit test. Some of the attribute used in the @Test annotation are

- expected
- timeout

```Java
    @Test
    public void testMethod(){

    }

    @Test(timeout = 200)
    public void anotherTestMethod(){

    }

    @Test(expected = SomeException.class)
    public void anotherTestMethod(){

    }
```

### @Before

This annotation is used to mark a method that needs to be executed before every test.

```Java
    @Before
    public void beforeEveryTest(){

    }
```

### @After

This annotation is used to mark a method that needs to be executed after every test

```Java
    @Before
    public void afterEveryTest(){

    }
```

### @BeforeClass

This annotation is used to mark a method that needs to be executed once before every tests. This method must be public and static.

```Java
    @BeforeClass
    public static void onlyOnceBefore(){

    }
```


### @AfterClass

This annotation is used to mark a method that needs to be executed once after every tests. This method must be public and static.

```Java
    @AfterClass
    public static void onlyOnceAfter(){

    }
```

### @Ignore

This annotation is used to make sure that a unit test is ignored and executed.

```Java
    @Test @Ignore
    public void ignoreThisTestMethod(){

    }
```

### Categories

Categories helps you runs only the classes and methods that are annotated with either the category given with the **@IncludeCategory** annotation, or a subtype of that category.

Categories are created as empty marker interfaces. They can be applied on classes and mehods.

```Java
    public interface SomeCategory{

    }
```

Categories must be annotated on the direct method or class.

```Java
    @Test
    @Category(SomeCategory.class)
    public void testMethod(){

    }
```

```Java
    @Category(SomeCategory.class)
    public class MyTestClass{

        @Test
        public void anotherTestMethod()

    }
```

## Test Suites

### Creating a Test Suite

Test suite enables the programmer to run mutiple test clasees from one location.

### @RunWith

```Java
    @RunWith(Suite.class)
    @Suite.SuiteClasses({
        TestCLassOne.class,
        TestClassTwo.class
    })
    public class TestSuiteClass {

    }
```

### Test suites that will execute the tests in the mentioned category

```Java
    @RunWith(Categories.class)
    @IncludeCategory(SomeCategory.class)
    @Suite.SuiteClasses({
        TestCLassOne.class,
        TestClassTwo.class
    })
    public class TestSuiteClass {

    }
```

### Test suites that will not execute the tests in the mentioned category

```Java
    @RunWith(Categories.class)
    @ExcludeCategory(SomeCategory.class)
    @Suite.SuiteClasses({
        TestCLassOne.class,
        TestClassTwo.class
    })
    public class TestSuiteClass {

    }
```
