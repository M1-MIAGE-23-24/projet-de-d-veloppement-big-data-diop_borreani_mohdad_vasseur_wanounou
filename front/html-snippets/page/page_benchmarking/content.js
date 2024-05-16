
export default class Content{

  content(){
    
    var benchmarkRandoMongoUpdate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/mongo/benchmark/update"),
      "language": "language-mongodb"
    });

    var benchmarkRandoRedisUpdate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/redis/benchmark/update"),
      "language": "language-mongodb"
    });

    var benchmarkRandoMongoGet = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/mongo/benchmark/get"),
      "language": "language-mongodb"
    });

    var benchmarkRandoRedisGet = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/redis/benchmark/get"),
      "language": "language-mongodb"
    });
     

    var benchmarkRandoMongoDelete = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/mongo/benchmark/delete"),
      "language": "language-mongodb"
    });

    var benchmarkRandoRedisDelete = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/redis/benchmark/delete"),
      "language": "language-mongodb"
    });

    var benchmarkRandoMongoCreate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/mongo/benchmark/create"),
      "language": "language-mongodb"
    });

    var benchmarkRandoRedisCreate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/randonne/redis/benchmark/create"),
      "language": "language-mongodb"
    });

    // ----------------------------------------------


    var benchmarkAvisMongoUpdate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/mongo/benchmark/update"),
      "language": "language-mongodb"
    });

    var benchmarkAvisRedisUpdate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/redis/benchmark/update"),
      "language": "language-mongodb"
    });

    var benchmarkAvisMongoGet = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/mongo/benchmark/get"),
      "language": "language-mongodb"
    });

    var benchmarkAvisRedisGet = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/redis/benchmark/get"),
      "language": "language-mongodb"
    });
     

    var benchmarkAvisMongoDelete = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/mongo/benchmark/delete"),
      "language": "language-mongodb"
    });

    var benchmarkAvisRedisDelete = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/redis/benchmark/delete"),
      "language": "language-mongodb"
    });

    var benchmarkAvisMongoCreate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/mongo/benchmark/create"),
      "language": "language-mongodb"
    });

    var benchmarkAvisRedisCreate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/redis/benchmark/create"),
      "language": "language-mongodb"
    });

     // ----------------------------------------------


     var benchmarkPointInteretMongoUpdate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/pointInteret/mongo/benchmark/update"),
      "language": "language-mongodb"
    });

    var benchmarkPointInteretRedisUpdate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/pointInteret/redis/benchmark/update"),
      "language": "language-mongodb"
    });

    var benchmarkPointInteretMongoGet = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/pointInteret/mongo/benchmark/get"),
      "language": "language-mongodb"
    });

    var benchmarkPointInteretRedisGet = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/pointInteret/redis/benchmark/get"),
      "language": "language-mongodb"
    });
     

    var benchmarkPointInteretMongoDelete = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/pointInteret/mongo/benchmark/delete"),
      "language": "language-mongodb"
    });

    var benchmarkPointInteretRedisDelete = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/redis/benchmark/delete"),
      "language": "language-mongodb"
    });

    var benchmarkPointInteretMongoCreate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/mongo/benchmark/create"),
      "language": "language-mongodb"
    });

    var benchmarkPointInteretRedisCreate = JSON.stringify({
      "code": encodeURIComponent("curl -X GET http://localhost:8080/avis/redis/benchmark/create"),
      "language": "language-mongodb"
    });


    return  ` 

        <div class="div3">
        <h2>Interface Api</h2>
          <p>
              Cette onglet à pour objectif de permettre aux utilisateurs de tester et comparer les performances des deux Bases de données a travers des tests type benchmark.
          </p>
      <div class="div4">
        <div class="div5"></div>
      <div class="div2">
      
        <!-- ----------------------------------- -->

        <div class="div1">
          <h2>Benchmark sur lecture des randonnées - Update</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoMongoUpdate}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoRedisUpdate}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkRandonneeUpdate" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des randonnées - Get</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoMongoGet}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoRedisGet}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkRandonneeGet" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des randonnées - Delete</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoMongoDelete}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoRedisDelete}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkRandonneeDelete" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des randonnées - Create</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoMongoCreate}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkRandoRedisCreate}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkRandonneeCreate" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <!-- --------------------------------------------------------------------------------------------- -->

        <div class="div1">
          <h2>Benchmark sur lecture des avis - Update</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisMongoUpdate}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisRedisUpdate}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkAvisUpdate" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des avis - Get</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisMongoGet}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisRedisGet}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkAvisGet" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des avis - Delete</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisMongoDelete}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisRedisDelete}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkAvisDelete" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des avis - Create</h2>
          p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisMongoCreate}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkAvisRedisCreate}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkAvisCreate" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <!-- --------------------------------------------------------------------------------------------- -->

        <div class="div1">
          <h2>Benchmark sur lecture des points d'interets - Update</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretMongoUpdate}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretRedisUpdate}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkPointInteretUpdate" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des points d'interets - Get</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretMongoGet}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretRedisGet}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkPointInteretGet" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des points d'interets - Delete</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretMongoDelete}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretRedisDelete}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkPointInteretDelete" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur lecture des points d'interets - Create</h2>
          <p class="paragraphe2">MongoDb</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretMongoCreate}></bt-code-presentation>
          <p class="paragraphe2">Redis</p>
          <bt-code-presentation jsonObjectString=${benchmarkPointInteretRedisCreate}></bt-code-presentation>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonBenchmarkPointInteretCreate" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>






        </div>
        </div>
  
       

        <!-- Popup -->
      <div id="popupGlobal"><div id="popup">
      <bt-icon id=popup1 jsonObjectString = '{"link":"https://upload.wikimedia.org/wikipedia/commons/1/18/Left_arrow.svg"}'></bt-icon>
      <div id="contentPopup"></div>
      </div></div>
    
    
            `
    }
}

