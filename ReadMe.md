# ReadMe
1. Install [maven](https://maven.apache.org/install.html)
2. Go to root folder of package `cd primeLib` 
3. Run below steps to execute it
	
```   
    mvn package
       
    <Sample Input and Output>
    
    java -jar target/primeLib-1.0.jar 2
    4 5
    5 6
    
    java -jar target/primeLib-1.0.jar 1.2
    1.2 is not an positive integer. This only accepts positive integers
    2019-10-07 22:08:20 ERROR o.s.boot.SpringApplication - Application startup failed
    java.lang.IllegalStateException: Failed to execute CommandLineRunner
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:779)
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:760)
	at org.springframework.boot.SpringApplication.afterRefresh(SpringApplication.java:747)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315)
	at com.prime.ConsoleApplication.main(ConsoleApplication.java:29)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:87)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:50)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51)
	Caused by: java.lang.RuntimeException: java.lang.NumberFormatException: For input string: "1.2"
	at com.prime.ConsoleApplication.run(ConsoleApplication.java:53)
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:776)
	... 12 common frames omitted
	Caused by: java.lang.NumberFormatException: For input string: "1.2"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.prime.ConsoleApplication.run(ConsoleApplication.java:41)
	... 13 common frames omitted
```
