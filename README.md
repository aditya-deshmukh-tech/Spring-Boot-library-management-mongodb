# Library-Management-Mongodb
This is production ready library-management app developed for future reference for production projects
This application uses mongodb database to insert, update, delete books

## Technologies and libraries used
1. Spring security
2. JWT
3. Spring Data JPA
4. MongoRepository

## Data Structures Used
3. ArrayList

## How to install
To clone repository use following command
```shell
https://github.com/aditya-deshmukh-tech/library-management-mongodb.git
```

once cloned create jar of project
```shell
mvn clean install -DskipTests
```
## Environment variables
This project requires 4 environment variables export them using following commands
1. jwt_secret = for hashing of jwt
2. jwt_validity = for validity of jwt token
3. jwt_refreshTokenValidity = validity of refresh token
4. jwt_expiredTokenValidity = validity of expired token
5. mongo_url = setting mongodb url
6. mongo_port = setting mongodb port number
7. mongo_db_name = setting mongodb database name
8. mongo_params = for mongodb ssl params not needed in local development

validities should be mentioned in milliseconds as default
```shell
export jwt_secret=random jwt_validity=60000 jwt_refreshTokenValidity=60000 jwt_expiredTokenValidity=120000 mongo_url=mongodb://localhost mongo_port=27017 mongo_db_name=library mongo_params=""
```
## Run the project
Once environment variables set run jar using following command
```shell
java -jar target/LibraryManagement-0.0.1-SNAPSHOT.jar
```
## Security APIs
For security apis you can use `security-api-curls` file where all curls command are present for each security api