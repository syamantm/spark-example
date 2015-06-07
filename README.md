# spark-example

## Install Spark for Scala 2.11

1. [Download](http://spark.apache.org/downloads.html) source and follow the [instructions](https://spark.apache.org/docs/latest/building-spark.html#building-for-scala-211) to build from source.

2. Add `PATH_TO_SPARK_SOURCE/bin` to `PATH`
 
 
## Build jar with your application code

```
$ gradlew build
```

jar will be located under `build/libs`

## Submit job to Spark

```
# Use spark-submit to run your application
$ spark-submit \
  --class "com.syamantakm.spark.SampleApp" \
  --master local[4] \
  build/libs/spark-example-1.1-SNAPSHOT.jar
```

