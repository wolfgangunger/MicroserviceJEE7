Created by Wolfgang Unger, 5.2017


Simple CA4 example with 2 entities and REST endpoints

Pre-Conditions:
Local Postgres DB (Standard Installation) with Schema 'ms'
User postgres, Password postgres

After Application Deployment (will create tables ) execute the insert script

---------------------------------

See UML diagramm for architecture

artefacts:

entity:
at least one entity is mandatory for database usage
superclasses : 
AbstractEntity (only ID - for simple entities)
BusinessEntity (created, createdBy ...)

TOI:
TransferObjectInterface
Design Pattern by Wolfgang Unger to avoid concrete Transfer Object classes and mapping methods

control:
DataService:
mandatory
handles db (entity methods) methods, CRUD and queries 

Service:
optional for complex entities
handles business logic, no queries and entity manager methods

BF:
BusinessFacade:
mandatory 
at least on BF is required. It can inject n services/dataServices and offer those methods