# ZipCode

Microservicio para consultar codigos postales de Mexico.

## Pruebas 🚀

### Test 1 entrada al servicio:

[Test 1](https://zipcode-283116.uc.r.appspot.com/).


### Test 2 entrada: 54713

[Test 2](https://zipcode-283116.uc.r.appspot.com/zip-codes/54713).

```
{
     "zip_code":"54713",
     "locality":"Cuautitlán Izcalli",
     "federal_entity":"México",
     "settlements":[
          {
              "name":"San Lorenzo Río Tenco",
              "zone_type":"Urbano",
              "settlement_type":"Pueblo"
          },
          {
              "name":"San Mateo Ixtacalco",
              "zone_type":"Urbano",
              "settlement_type":"Pueblo"
          },
          {
              "name":"Santa Bárbara",
              "zone_type":"Urbano",
              "settlement_type":"Pueblo"
           },
           {
              "name":"El Sabino",
              "zone_type":"Urbano",
              "settlement_type":"Colonia"
           }
          ],"municipality":"Cuautitlán Izcalli"
}
```

### Test 3 entrada:nocp

[Test 3](https://zipcode-283116.uc.r.appspot.com/nocp).
```
{
    "status":404,
    "message":"No se encontraron registros con este código postal."
}




## Construido con 🛠️
* spring-boot 2.1.15.BUILD-SNAPSHOT
* Maven 4.0.0
* Tomcat-embed 9.0.34
* STS 4.6.1.RELEASE

## Autores ✒️

* **Fernando Octavio Sanchez Chavez** 
