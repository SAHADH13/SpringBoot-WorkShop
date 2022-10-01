//Annotations

  @TestInstance(TestInstance.Lifecycle.PER_CLASS)  --->  by using this annotation like this then only create the instance of this class only once!!!  (it help to avoid the static keyword from the required methods)

  @BeforeAll --> which is used to work before the instance is created (method must be static)

  @BeforeEach --> used for work before each method

  @AfterEach --> used for work after each method

  @DisplayName --> used for display some meaning naming for the test method

  @EnabledOnOs(OS.LINUX) --> the method only works on linux os and other os act as an disabled method

  @EnabledOnJre(JRE.JAVA_11) --> its work only the java version 11

  @Disabled -->  disabled method will be skipped !



// methods

  assumeTrue(boolean value);  -->  used to run certain methods while the assumption is currect!

  RepetitionInfo  -->  which contains couple of methods to help repetition wor