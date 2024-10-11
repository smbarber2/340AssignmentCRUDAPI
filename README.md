# API Endpoints
Using POSTMAN, you can access the following endpoints:

## Get list of animals

###Request

    `GET /animals/all`

    `http://localhost:8080/animals/all`

   
### Response

     [
   
     {"animalId": 1, "name": "sample1", "species": "mammal", "habitat" : "house", "description" : "sample"}, 
   
     {"animalId": 2, "name": "sample2", "species": "amphibian", "habitat" : "house", "description" : "sample"}, 
   
     { "animalId": 3, "name": "sample3", "species": "mammal", "habitat" : "house", "description" : "sample"}
   
     ]

## Get a specific animal

### Request

`GET /animals/{animalId}`

`http://localhost:8080/animals/1`

### Response

    {
      "animalId": 1,
      "name": "sample1",
      "species": "mammal",
      "habitat" : "house",
      "description" : "sample"
    }

     
## Create a new animal

### Request

    `POST /animals/new`
    
    `http://localhost:8080/animals/new` --data '{ "name": "Bluejay", "species": "bird", "habitat" : "house", "description" : "sample"}'

   ### Response

   [
   
     {"animalId": 1, "name": "sample1", "species": "mammal", "habitat" : "house", "description" : "sample"}, 
   
     {"animalId": 2, "name": "sample2", "species": "amphibian", "habitat" : "house", "description" : "sample"}, 
   
     { "animalId": 3, "name": "sample3", "species": "mammal", "habitat" : "house", "description" : "sample"},

     { "animalId":4, "Bluejay": "sample4", "species": "bird", "habitat" : "house", "description" : "sample"}
   
  ]

## Get animals by species

### Request

    `GET /animals?species=mammal`

    `http://localhost:8080/animals?species=mammal`

   
### Response

     [
   
      {"animalId": 1, "name": "sample1", "species": "mammal", "habitat" : "house", "description" : "sample"}, 

     { "animalId": 3, "name": "sample3", "species": "mammal", "habitat" : "house", "description" : "sample"},
   
     ]
     

## Update an existing animal

### Request

    `PUT /animals/update/{animalId}`
    
    `http://localhost:8080/animals/update/1` --data '{"animalId": 1, "name": "cat", "species": "mammal", "habitat" : "house", "description" : "updated sample"}'

   ### Response
   
    {
      "animalId": 1,
      "name": "cat",
      "species": "mammal",
      "habitat" : "house",
      "description" : "updated sample"
    }


## Delete an existing animal

### Request

    `DELETE /animals/delete/{animalId}`
    
    `http://localhost:8080/animals/delete/1`

   ### Response
   
   [
   
     {"animalId": 2, "name": "sample2", "species": "amphibian", "habitat" : "house", "description" : "sample"}, 
   
     { "animalId": 3, "name": "sample3", "species": "mammal", "habitat" : "house", "description" : "sample"},

     { "animalId": 4, "name": "Bluejay", "species": "bird", "habitat" : "house", "description" : "sample"}
   
  ]

  ## Search for animals whose name contains [Query]

  ### Request
  
      `GET /animals/search?contains=blue`
      
      `http://localhost:8080/animals/search?contains=blue`

 ### Response
   
   [
   
     { "animalId": 4, "name": "Bluejay", "species": "bird", "habitat" : "house", "description" : "sample"}
   
  ]
