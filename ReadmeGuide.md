## Utiles

### Contrôleur MongoDB pour les Randonnées

Voici les différentes URL disponibles dans le contrôleur `RandonneMongoDBController` et leurs descriptions :

Pour Redis, il faut juste ```randonne/redis``` à la place de ```randonne/mongo``` pour toutes les reqêtes.

1. **Créer une randonnée**
    - **URL** : `http://localhost:8080/randonne/mongo/`
    - **Méthode HTTP** : `POST`
    - **Description** : Crée une nouvelle randonnée dans MongoDB.
    - **Exemple de requête** :
      ```json
      POST /randonne/mongo/
      {
        "ra_id": 1,
        "ra_label": "Sample Randonne",
        "ra_description": "This is a sample description",
        "ra_duree": 120,
        "ra_difficulte": "Medium",
        "ra_denivele": 500,
        "ra_distance": 10.5,
        "ra_boucle": true,
        "po_id": 1,
        "av_id": 1
      }
      ```

2. **Récupérer une randonnée par ID**
    - **URL** : `http://localhost:8080/randonne/mongo/{id}`
    - **Méthode HTTP** : `GET`
    - **Description** : Récupère une randonnée spécifique par son ID.
    - **Exemple de requête** :
      ```json
      GET /randonne/mongo/{id}
      ```

3. **Mettre à jour une randonnée**
    - **URL** : `http://localhost:8080/randonne/mongo/{id}`
    - **Méthode HTTP** : `PUT`
    - **Description** : Met à jour les informations d'une randonnée spécifique par son ID.
    - **Exemple de requête** :
      ```json
      PUT /randonne/mongo/{id}
      {
        "ra_label": "Updated Randonne",
        "ra_description": "Updated description"
        // autres champs mis à jour
      }
      ```

4. **Supprimer une randonnée**
    - **URL** : `http://localhost:8080/randonne/mongo/{id}`
    - **Méthode HTTP** : `DELETE`
    - **Description** : Supprime une randonnée spécifique par son ID.
    - **Exemple de requête** :
      ```json
      DELETE /randonne/mongo/{id}
      ```

5. **Rechercher des randonnées**
    - **URL** : `http://localhost:8080/randonne/mongo/search`
    - **Méthode HTTP** : `POST`
    - **Description** : Recherche des randonnées en fonction des critères spécifiés.
    - **Exemple de requête** :
      ```json
      POST /randonne/mongo/search
      {
        "ra_label": "Sample"
        // autres critères de recherche
      }
      ```

6. **Obtenir des randonnées avec des points d'intérêt**
    - **URL** : `http://localhost:8080/randonne/mongo/join`
    - **Méthode HTTP** : `GET`
    - **Description** : Récupère les randonnées avec leurs points d'intérêt associés.
    - **Exemple de requête** :
      ```json
      GET /randonne/mongo/join
      ```

### Benchmarks de performance

Le contrôleur propose également plusieurs URL pour exécuter des benchmarks de performance sur les opérations CRUD et les recherches.

1. **Benchmark de création (1000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/create`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de création de 1000 randonnées.

2. **Benchmark de récupération (1000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/get`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de récupération de 1000 randonnées.

3. **Benchmark de mise à jour (1000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/update`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de mise à jour de 1000 randonnées.

4. **Benchmark de suppression (1000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/delete`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de suppression de 1000 randonnées.

5. **Benchmark de recherche (1000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/search`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de recherche sur 1000 randonnées.

6. **Benchmark de jointure (5 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/join`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de jointure sur 5 randonnées.

7. **Benchmark de création (10000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/create/10000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de création de 10000 randonnées.

8. **Benchmark de récupération (10000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/get/10000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de récupération de 10000 randonnées.

9. **Benchmark de mise à jour (10000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/update/10000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de mise à jour de 10000 randonnées.

10. **Benchmark de suppression (10000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/delete/10000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de suppression de 10000 randonnées.

11. **Benchmark de recherche (10000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/search/10000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de recherche sur 10000 randonnées.

12. **Benchmark de création (20000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/create/20000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de création de 20000 randonnées.

13. **Benchmark de récupération (20000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/get/20000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de récupération de 20000 randonnées.

14. **Benchmark de mise à jour (20000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/update/20000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de mise à jour de 20000 randonnées.

15. **Benchmark de suppression (20000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/delete/20000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de suppression de 20000 randonnées.

16. **Benchmark de recherche (20000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/search/20000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de recherche sur 20000 randonnées.

17. **Benchmark de création (50000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/create/50000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de création de 50000 randonnées.

18. **Benchmark de récupération (50000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/get/50000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de récupération de 50000 randonnées.

19. **Benchmark de mise à jour (50000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/update/50000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de mise à jour de 50000 randonnées.

20. **Benchmark de suppression (50000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/delete/50000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de suppression de 50000 randonnées.

21. **Benchmark de recherche (50000 entrées)**
    - **URL** : `http://localhost:8080/randonne/mongo/benchmark/search/50000`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de recherche sur 50000 randonnées.

Ces benchmarks permettent de mesurer les performances des différentes opérations CRUD ainsi que des opérations de recherche et de jointure dans MongoDB.

### Contrôleur MongoDB pour les Avis

Pour Redis, il faut juste ```avis/redis``` à la place de ```avis/mongo``` pour toutes les reqêtes.

Voici les différentes URL disponibles dans le contrôleur `AvisMongoDBController` et leurs descriptions :

1. **Créer un avis**
    - **URL** : `http://localhost:8080/avis/mongo/`
    - **Méthode HTTP** : `POST`
    - **Description** : Crée un nouvel avis dans MongoDB.
    - **Exemple de requête** :
      ```json
      POST /avis/mongo/
      {
        "av_id": 1,
        "av_etoile": "FIVE",
        "av_message": "Great hike!"
      }
      ```

2. **Récupérer un avis par ID**
    - **URL** : `http://localhost:8080/avis/mongo/{id}`
    - **Méthode HTTP** : `GET`
    - **Description** : Récupère un avis spécifique par son ID.
    - **Exemple de requête** :
      ```json
      GET /avis/mongo/{id}
      ```

3. **Mettre à jour un avis**
    - **URL** : `http://localhost:8080/avis/mongo/{id}`
    - **Méthode HTTP** : `PUT`
    - **Description** : Met à jour les informations d'un avis spécifique par son ID.
    - **Exemple de requête** :
      ```json
      PUT /avis/mongo/{id}
      {
        "av_etoile": "FOUR",
        "av_message": "Updated message"
        // autres champs mis à jour
      }
      ```

4. **Supprimer un avis**
    - **URL** : `http://localhost:8080/avis/mongo/{id}`
    - **Méthode HTTP** : `DELETE`
    - **Description** : Supprime un avis spécifique par son ID.
    - **Exemple de requête** :
      ```json
      DELETE /avis/mongo/{id}
      ```

### Benchmarks de performance

Le contrôleur propose également plusieurs URL pour exécuter des benchmarks de performance sur les opérations CRUD.

1. **Benchmark de création (1000 entrées)**
    - **URL** : `http://localhost:8080/avis/mongo/benchmark/create`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de création de 1000 avis.

2. **Benchmark de récupération (1000 entrées)**
    - **URL** : `http://localhost:8080/avis/mongo/benchmark/get`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de récupération de 1000 avis.

3. **Benchmark de mise à jour (1000 entrées)**
    - **URL** : `http://localhost:8080/avis/mongo/benchmark/update`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de mise à jour de 1000 avis.

4. **Benchmark de suppression (1000 entrées)**
    - **URL** : `http://localhost:8080/avis/mongo/benchmark/delete`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de suppression de 1000 avis.

Ces benchmarks permettent de mesurer les performances des différentes opérations CRUD pour les avis dans MongoDB.

### Contrôleur MongoDB pour les Points d'Intérêt

Voici les différentes URL disponibles dans le contrôleur `PointInteretMongoDBController` et leurs descriptions :

Pour Redis, il faut juste ```pointInteret/redis``` à la place de ```pointInteret/mongo``` pour toutes les reqêtes.

1. **Créer un point d'intérêt**
    - **URL** : `http://localhost:8080/pointInteret/mongo/`
    - **Méthode HTTP** : `POST`
    - **Description** : Crée un nouveau point d'intérêt dans MongoDB.
    - **Exemple de requête** :
      ```json
      POST /pointInteret/mongo/
      {
        "po_id": 1,
        "po_description": "Sample Point Interet",
        "po_lien_photo": "http://example.com/photo.jpg"
      }
      ```

2. **Récupérer un point d'intérêt par ID**
    - **URL** : `http://localhost:8080/pointInteret/mongo/{id}`
    - **Méthode HTTP** : `GET`
    - **Description** : Récupère un point d'intérêt spécifique par son ID.
    - **Exemple de requête** :
      ```json
      GET /pointInteret/mongo/{id}
      ```

3. **Mettre à jour un point d'intérêt**
    - **URL** : `http://localhost:8080/pointInteret/mongo/{id}`
    - **Méthode HTTP** : `PUT`
    - **Description** : Met à jour les informations d'un point d'intérêt spécifique par son ID.
    - **Exemple de requête** :
      ```json
      PUT /pointInteret/mongo/{id}
      {
        "po_description": "Updated Point Interet",
        "po_lien_photo": "http://example.com/updated_photo.jpg"
        // autres champs mis à jour
      }
      ```

4. **Supprimer un point d'intérêt**
    - **URL** : `http://localhost:8080/pointInteret/mongo/{id}`
    - **Méthode HTTP** : `DELETE`
    - **Description** : Supprime un point d'intérêt spécifique par son ID.
    - **Exemple de requête** :
      ```json
      DELETE /pointInteret/mongo/{id}
      ```

5. **Rechercher des points d'intérêt**
    - **URL** : `http://localhost:8080/pointInteret/mongo/search`
    - **Méthode HTTP** : `POST`
    - **Description** : Recherche des points d'intérêt en fonction des critères spécifiés.
    - **Exemple de requête** :
      ```json
      POST /pointInteret/mongo/search
      {
        "po_description": "Sample"
        // autres critères de recherche
      }
      ```

### Benchmarks de performance

Le contrôleur propose également plusieurs URL pour exécuter des benchmarks de performance sur les opérations CRUD et les recherches.

1. **Benchmark de création (1000 entrées)**
    - **URL** : `http://localhost:8080/pointInteret/mongo/benchmark/create`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de création de 1000 points d'intérêt.

2. **Benchmark de récupération (1000 entrées)**
    - **URL** : `http://localhost:8080/pointInteret/mongo/benchmark/get`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de récupération de 1000 points d'intérêt.

3. **Benchmark de mise à jour (1000 entrées)**
    - **URL** : `http://localhost:8080/pointInteret/mongo/benchmark/update`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de mise à jour de 1000 points d'intérêt.

4. **Benchmark de suppression (1000 entrées)**
    - **URL** : `http://localhost:8080/pointInteret/mongo/benchmark/delete`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de suppression de 1000 points d'intérêt.

5. **Benchmark de recherche (1000 entrées)**
    - **URL** : `http://localhost:8080/pointInteret/mongo/benchmark/search`
    - **Méthode HTTP** : `GET`
    - **Description** : Exécute un benchmark de recherche sur 1000 points d'intérêt.

Ces benchmarks permettent de mesurer les performances des différentes opérations CRUD pour les points d'intérêt dans MongoDB.