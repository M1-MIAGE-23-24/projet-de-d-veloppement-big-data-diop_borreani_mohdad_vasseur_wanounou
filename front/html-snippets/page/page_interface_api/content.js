
export default class Content{

  content(){

    let lectureRandoMongo = JSON.stringify({
      "code": encodeURIComponent("db.randonnees.findOne({\n\t_id: ObjectId('[valeur_de_l_id]')\n})"),
      "language": "language-mongodb"
    });

    let lectureRandoRedis = JSON.stringify({
      "code": encodeURIComponent("SET valeur_de_l_id '{\"_id\": \"[valeur_de_l_id]\"}'"),
      "language": "language-mongodb"
    });



//db.randonnees.findOne({_id: ObjectId("ID_de_la_randonnée")})

        return  ` 

        <div class="div3">
        <h2>Interface Api</h2>
          <p>
              Cette onglet à pour objectif de tester différentes requêtes sur les deux bases de données en même temps.
          </p>
      <div class="div4">
        <div class="div5"></div>
      <div class="div2">
      
        <!-- Randonnée -->

        <div class="div1">
          <h2>Lecture d'une randonnée</h2>
          <div class="page_box">
            <p class="paragraphe2">MongoDb</p>
            <bt-code-presentation jsonObjectString=${lectureRandoMongo}></bt-code-presentation>
            <p class="paragraphe2">Redis</p>
            <bt-code-presentation jsonObjectString=${lectureRandoRedis}></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>ID de la randonnée</p></div>
          <bt-input jsonObjectString='{"label":"ID de la randonnée"}'></bt-input>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Supression d'une randonnée</h2>
          <div class="page_box">
            <p class="paragraphe2">MongoDb</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
            <p class="paragraphe2">Redis</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>ID de la randonnée</p></div>
          <bt-input jsonObjectString='{"label":"ID de la randonnée"}'></bt-input>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Insertion d'une Randonnée</h2>
          <div class="page_box">
            <p class="paragraphe2">MongoDb</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
            <p class="paragraphe2">Redis</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <div class="paragraphe"><p>id</p></div>
          <bt-input jsonObjectString='{"label":"id"}'></bt-input>
          <div class="paragraphe"><p>Nom de la randonnée</p></div>
          <bt-input jsonObjectString='{"label":"Nom de la randonnée"}'></bt-input>
          <div class="paragraphe"><p>Longitude</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Longitude"}'></bt-input>
          <div class="paragraphe"><p>Latitude</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Latitude"}'></bt-input>
          <div class="paragraphe"><p>Description</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Description"}'></bt-input>
          <div class="paragraphe"><p>Durée</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Durée"}'></bt-input>
          <div class="paragraphe"><p>Difficulté</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Difficulté"}'></bt-input>
          <div class="paragraphe"><p>Dénivelé</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Dénivelé"}'></bt-input>
          <div class="paragraphe"><p>Distance</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Distance"}'></bt-input>
          <div class="paragraphe"><p>Boucle</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Boucle"}'></bt-input>
          <div class="paragraphe"><p>Points d'interêts ID</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Point d interêt ID"}'></bt-input>
          <div class="paragraphe"><p>Avis ID</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Avis ID"}'></bt-input>
          <div class="div6"><bt-button id="eee" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>
        
        
      
        <div class="div1">
            <h2>Modification d'une randonnée</h2>
            <div class="page_box">
            <p class="paragraphe2">MongoDb</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
            <p class="paragraphe2">Redis</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <div class="paragraphe"><p>id</p></div>
          <bt-input jsonObjectString='{"label":"id"}'></bt-input>
          <div class="paragraphe"><p>Nom de la randonnée</p></div>
          <bt-input jsonObjectString='{"label":"Nom de la randonnée"}'></bt-input>
          <div class="paragraphe"><p>Longitude</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Longitude"}'></bt-input>
          <div class="paragraphe"><p>Latitude</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Latitude"}'></bt-input>
          <div class="paragraphe"><p>Description</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Description"}'></bt-input>
          <div class="paragraphe"><p>Durée</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Durée"}'></bt-input>
          <div class="paragraphe"><p>Difficulté</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Difficulté"}'></bt-input>
          <div class="paragraphe"><p>Dénivelé</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Dénivelé"}'></bt-input>
          <div class="paragraphe"><p>Distance</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Distance"}'></bt-input>
          <div class="paragraphe"><p>Boucle</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Boucle"}'></bt-input>
          <div class="paragraphe"><p>Points d'interêts ID</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Point d interêt ID"}'></bt-input>
          <div class="paragraphe"><p>Avis ID</p></div>
          <bt-input id="ttt" jsonObjectString='{"label":"Avis ID"}'></bt-input>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <!-- Avis -->

        <div class="div1">
          <h2>Lecture d'un avis</h2>
          <div class="page_box">
            <p class="paragraphe2">MongoDb</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
            <p class="paragraphe2">Redis</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Supression d'un avis</h2>
          <div class="page_box">
            <p class="paragraphe2">MongoDb</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
            <p class="paragraphe2">Redis</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Insertion d'un avis</h2>
          <div class="page_box">
            <p class="paragraphe2">MongoDb</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
            <p class="paragraphe2">Redis</p>
            <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <div class="paragraphe"><p>id</p></div>
          <bt-input jsonObjectString='{"label":"Avis id"}'></bt-input>
          <div class="paragraphe"><p>Nombre d'étoile</p></div>
          <bt-input jsonObjectString='{"label":"Nombre d étoile"}'></bt-input>
          <div class="paragraphe"><p>Message</p></div>
          <bt-input jsonObjectString='{"label":"Message"}'></bt-input>
          <div class="paragraphe"><p>Rando ID</p></div>
          <bt-input jsonObjectString='{"label":"Rando id"}'></bt-input>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

      <div class="div1">
        <h2>Modification d'un avis</h2>
        <div class="page_box">
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
        <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
        </div>
        <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <div class="paragraphe"><p>id</p></div>
          <bt-input jsonObjectString='{"label":"Avis id"}'></bt-input>
          <div class="paragraphe"><p>Nombre d'étoile</p></div>
          <bt-input jsonObjectString='{"label":"Nombre d étoile"}'></bt-input>
          <div class="paragraphe"><p>Message</p></div>
          <bt-input jsonObjectString='{"label":"Message"}'></bt-input>
          <div class="paragraphe"><p>Rando ID</p></div>
          <bt-input jsonObjectString='{"label":"Rando id"}'></bt-input>
          <bt-container class="space"></bt-container>
        <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
      </div>

      <!-- Point d'interet -->

      <div class="div1">
          <h2>Lecture d'un point d'interet</h2>
          <div class="page_box">
          <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <bt-container class="space"></bt-container>          <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
        <h2>Supression d'un point d'interet</h2>
        <div class="page_box">
        <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
        <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
        </div>
        <bt-container class="space"></bt-container>
        <div class="paragraphe"><p>uuid</p></div>
        <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
        <bt-container class="space"></bt-container>       
        <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
      </div>

      <div class="div1">
          <h2>Insertion d'un point d'interet</h2>
          <div class="page_box">
          <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
          </div>
          <bt-container class="space"></bt-container>
          <div class="paragraphe"><p>uuid</p></div>
          <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
          <div class="paragraphe"><p>id</p></div>
          <bt-input jsonObjectString='{"label":"id"}'></bt-input>
          <div class="paragraphe"><p>Longitude</p></div>
          <bt-input jsonObjectString='{"label":"Longitude"}'></bt-input>
          <div class="paragraphe"><p>Latitude</p></div>
          <bt-input jsonObjectString='{"label":"Latitude"}'></bt-input>
          <div class="paragraphe"><p>Description</p></div>
          <bt-input jsonObjectString='{"label":"Description"}'></bt-input>
          <div class="paragraphe"><p>Lien photo</p></div>
          <bt-input jsonObjectString='{"label":"Lien photo"}'></bt-input>
          <div class="paragraphe"><p>Rando ID</p></div>
          <bt-input jsonObjectString='{"label":"Rando ID"}'></bt-input>
          <bt-container class="space"></bt-container>            <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

      

      <div class="div1">
        <h2>Modification d'un point d'interet</h2>
        <div class="page_box">
        <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
        <bt-code-presentation jsonObjectString='{"code":"&lt;div&gt;Hello, world!&lt;/div&gt;","language": "language-html"}'></bt-code-presentation>
        </div>
        <bt-container class="space"></bt-container>
        <div class="paragraphe"><p>uuid</p></div>
        <bt-input jsonObjectString='{"label":"uuid"}'></bt-input>
        <div class="paragraphe"><p>id</p></div>
        <bt-input jsonObjectString='{"label":"id"}'></bt-input>
        <div class="paragraphe"><p>Longitude</p></div>
        <bt-input jsonObjectString='{"label":"Longitude"}'></bt-input>
        <div class="paragraphe"><p>Latitude</p></div>
        <bt-input jsonObjectString='{"label":"Latitude"}'></bt-input>
        <div class="paragraphe"><p>Description</p></div>
        <bt-input jsonObjectString='{"label":"Description"}'></bt-input>
        <div class="paragraphe"><p>Lien photo</p></div>
        <bt-input jsonObjectString='{"label":"Lien photo"}'></bt-input>
        <div class="paragraphe"><p>Rando ID</p></div>
        <bt-input jsonObjectString='{"label":"Rando ID"}'></bt-input>
        <bt-container class="space"></bt-container>               <div class="div6"><bt-button jsonObjectString='{"label":"Lancer"}'></bt-button></div>
      </div>



      
      </div>
      </div>
    
    
    
    
            `
    }
}

