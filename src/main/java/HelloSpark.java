import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class HelloSpark {

    static String LOG_FILE = "<File Path>/HelloSpark/src/main/resources/data-file.txt";

    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder().appName("Hello Spark").getOrCreate();

        Dataset<String> logData = spark.read().textFile(LOG_FILE).cache();

        long numAs = logData.filter(s -> s.contains("a")).count();
        long numBs = logData.filter(s -> s.contains("b")).count();

        System.out.println("Lines with a: " + numAs +", lines with b: " + numBs);

        spark.stop();
    }
}
