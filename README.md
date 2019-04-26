Apache Spark Hello World (SQL)
------------------------------

Spark Version: 2.3

This example demonstrate the basic setup for extracting word count from text file using Apache Spark in Java. You can find
the sample code in official documentation from below link.

https://spark.apache.org/docs/2.3.0/quick-start.html


*Steps to Run*

1. Build the project

$ mvn package

2. SPARK_HOME/bin should be in the system PATH before executing the command below (and also working Spark setup ;-) ).

$ spark-submit --class "HelloSpark" --master local[4] target/HelloSpark-1.0-SNAPSHOT.jar

> --master local[4] : Run application locally on 4 worker threads 
        (ideally, set this to the number of cores on your machine). 
        Should be greater than 1, since one thread should be allocated to Spark itself.
        Use '*' to use all the available cores.