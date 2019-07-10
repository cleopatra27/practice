- `mvn test` to test queue.

# A Google Analytic like Backend System
![alt text](https://github.com/cleopatra27/practice/blob/master/Analytics.jpg)

## SOLUTION

The process starts on a visitor’s browser, where an XMLHttpRequest request to an API Gateway is initiated. The request event is then passed to Lambda where event data is processed and written to a Kinesis Data Stream. Kinesis Firehose uses the Kinesis Data Stream as input and writes processed parquet files to S3. Athena is used to query parquet files directly from S3. Elasticsearch will generate visualization in a browser.
