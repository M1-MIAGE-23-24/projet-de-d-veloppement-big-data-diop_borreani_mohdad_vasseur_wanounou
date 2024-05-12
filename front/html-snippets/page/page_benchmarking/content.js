
export default class Content{

    content(){
       
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
          <h2>Benchmark sur lecture des randonnées</h2>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonLectureRandonnee" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur ecriture des randonnées</h2>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonEcritureRandonnee" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur supression des randonnées</h2>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonSupressionRandonnee" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        <div class="div1">
          <h2>Benchmark sur modification des randonnées</h2>
          <bt-container class="space"></bt-container>
          <div class="div6"><bt-button id="boutonModificationRandonnee" jsonObjectString='{"label":"Lancer"}'></bt-button></div>
        </div>

        </div>
        </div>
  
        <!-- Popup -->
        <div id="popupGlobal"><div id="popup">
          <bt-icon id=popup1 jsonObjectString = '{"link":"https://upload.wikimedia.org/wikipedia/commons/1/18/Left_arrow.svg"}'></bt-icon>
        </div></div>
    
    
    
    
    
    
    
            `
    }
}

