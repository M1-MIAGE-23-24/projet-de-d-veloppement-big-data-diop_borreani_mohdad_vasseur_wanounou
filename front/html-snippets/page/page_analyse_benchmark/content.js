
export default class Content{

    content(){

       
        return  ` 

      

        <div class="divGlobal">
        <div class="divAnnalyseBenchmark">
        
        
          <h2>Analyse des Benchmarkings  </h2>

          <p>Benchmarking de Update pour 10000 éléments</p>

          <bt-chart class="char" jsonObjectString='{
            "chart": {
              "type": "bar",
              "data": {
                "labels": ["MongoDB", "Redis"],
                "datasets": [{
                  "label": "Minimum",
                  "data": [0.098792, 0.105334],
                  "borderWidth": 1
                },
                {
                  "label": "Maximum",
                  "data": [1.947584, 2.756833
                  ],
                  "borderWidth": 1
                },
                {
                  "label": "Moyenne",
                  "data": [0.233846761, 0.277238207],
                  "borderWidth": 1
                }
              ]
              },
              "options": {
                "scales": {
                  "y": {
                    "beginAtZero": true
                  }
                }
              }
            }
          }'></bt-chart>

          <p>Benchmarking de Update pour 10000 éléments</p>

          <bt-chart class="char" jsonObjectString='{
            "chart": {
              "type": "bar",
              "data": {
                "labels": ["MongoDB", "Redis"],
                "datasets": [{
                  "label": "Minimum",
                  "data": [0.104375, 0.104416],
                  "borderWidth": 1
                },
                {
                  "label": "Maximum",
                  "data": [2.047291, 1.398625],
                  "borderWidth": 1
                },
                {
                  "label": "Moyenne",
                  "data": [0.237341258, 0.23245444099999998],
                  "borderWidth": 1
                }
              ]
              },
              "options": {
                "scales": {
                  "y": {
                    "beginAtZero": true
                  }
                }
              }
            }
          }'></bt-chart>
        
        
        
            
            `
    }
}

