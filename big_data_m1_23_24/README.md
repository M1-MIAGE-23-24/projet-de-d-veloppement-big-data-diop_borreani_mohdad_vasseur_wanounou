Projet Big Data :
=================

Ce projet a pour objectif de vous proposer un exemple d'implémentation capable de proposer proprement une interface vers différentes sources de données.

Environnement :
- Java 17
- Spring Boot 3.2.4
- Docker LTS

Dépendances :
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

Points clés : 
- Deux controlleurs proposent une interface vers une entité commune : User
- Une interface permets de proposer une implémentation uniforme pour l'accès aux données
- Deux implémentations sont proposées : une en base de données H2 et une dans un fichier
- Utilisation du mécanisme d'injection de dépendance pour choisir l'implémentation à utiliser (utilisation des @Qualifier)
- Au démarage, l'application va créer une base de données H2 en mémoire et y insérer quelques utilisateurs.
- L'application expose deux endpoints principaux :
  - /users/{id} : retourne un utilisateur en fonction de son id
  - /fileUsers/{id} : retourne un utilisateur en fonction de son id, mais cette fois-ci en utilisant l'implémentation fichier


# 0. Prérequis
Avant d'exécuter le projet, il est nécessaire de lancer les SGDBs avec la commande suivante : \
```docker-compose up -d``` \
Assurez vous d'avoir les ports 6379 et 27017 de libre sur votre machine.

# 1. Exécution :
```./gradlew bootRun```

