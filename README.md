# Logging Sample

Sample of how to use the ELK stack with Spring Boot.

## Prerequisites

1. Java 8
2. Docker Compose
3. Docker


## Running Locally
1. Run the ELK docker compose file
    ```shell script
    $ docker-compose up -d
    ```
2. Once the ELK stack is started, navigate to the [kibana dashboard](http://localhost:5601)
3. Run the application
    ```shell script
   $ ./gradlew bootrun
    ```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)