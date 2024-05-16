export default class Content {
  content() {
      return `
      <div class="divGlobal">
          <div class="divAnalyseBenchmark">
              <h2>Analyse du Benchmark</h2>
              <p>Comparaison des performances entre MongoDB et Redis pour les opérations CRUD et les requêtes multicritères.</p>

              <h3>Temps de Réponse maximum des Requêtes (ms) pour 1000 données</h3>
              <bt-chart class="chart" jsonObjectString='{
                  "chart": {
                      "type": "bar",
                      "data": {
                          "labels": ["Lecture", "Écriture", "Suppression", "Modification", "Requête Multicritères"],
                          "datasets": [
                              {
                                  "label": "MongoDB (max)",
                                  "data": [10, 20, 10, 15, 25],
                                  "backgroundColor": "rgba(255, 99, 132, 0.2)",
                                  "borderColor": "rgba(255, 99, 132, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "Redis (max)",
                                  "data": [20, 30, 15, 25, 35],
                                  "backgroundColor": "rgba(153, 102, 255, 0.2)",
                                  "borderColor": "rgba(153, 102, 255, 1)",
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


              <h3>Temps de Réponse minimum des Requêtes (ms) pour 1000 données</h3>
              <bt-chart class="chart" jsonObjectString='{
                  "chart": {
                      "type": "bar",
                      "data": {
                          "labels": ["Lecture", "Écriture", "Suppression", "Modification", "Requête Multicritères"],
                          "datasets": [
                              {
                                  "label": "MongoDB (min)",
                                  "data": [30, 45, 20, 35, 50],
                                  "backgroundColor": "rgba(54, 162, 235, 0.2)",
                                  "borderColor": "rgba(54, 162, 235, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "Redis (min)",
                                  "data": [10, 20, 10, 15, 25],
                                  "backgroundColor": "rgba(255, 206, 86, 0.2)",
                                  "borderColor": "rgba(255, 206, 86, 1)",
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


              <h3>Temps de Réponse moyen des Requêtes (ms) pour 1000 données/h3>
              <bt-chart class="chart" jsonObjectString='{
                  "chart": {
                      "type": "bar",
                      "data": {
                          "labels": ["Lecture", "Écriture", "Suppression", "Modification", "Requête Multicritères"],
                          "datasets": [
                              {
                                  "label": "MongoDB (moyen)",
                                  "data": [30, 45, 20, 35, 50],
                                  "backgroundColor": "rgba(255, 159, 64, 0.2)",
                                  "borderColor": "rgba(255, 159, 64, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "Redis (moyen)",
                                  "data": [10, 20, 10, 15, 25],
                                  "backgroundColor": "rgba(75, 192, 192, 0.2)",
                                  "borderColor": "rgba(75, 192, 192, 1)",
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


              <h3>Empreinte Mémoire et CPU pour 1 donnée</h3>
              <bt-chart class="chart" jsonObjectString='{
                  "chart": {
                      "type": "bar",
                      "data": {
                          "labels": ["Lecture", "Écriture", "Suppression", "Modification", "Requête Multicritères"],
                          "datasets": [
                              {
                                  "label": "MongoDB (mémoire)",
                                  "data": [60, 70, 50, 65, 80],
                                  "backgroundColor": "rgba(54, 162, 235, 0.2)",
                                  "borderColor": "rgba(54, 162, 235, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "MongoDB (CPU)",
                                  "data": [30, 40, 25, 35, 45],
                                  "backgroundColor": "rgba(75, 192, 192, 0.2)",
                                  "borderColor": "rgba(75, 192, 192, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "Redis (mémoire)",
                                  "data": [40, 50, 30, 45, 60],
                                  "backgroundColor": "rgba(255, 99, 132, 0.2)",
                                  "borderColor": "rgba(255, 99, 132, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "Redis (CPU)",
                                  "data": [20, 30, 15, 25, 35],
                                  "backgroundColor": "rgba(255, 159, 64, 0.2)",
                                  "borderColor": "rgba(255, 159, 64, 1)",
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


              <h3>Empreinte Mémoire et CPU pour 100 données</h3>
              <bt-chart class="chart" jsonObjectString='{
                  "chart": {
                      "type": "bar",
                      "data": {
                          "labels": ["Lecture", "Écriture", "Suppression", "Modification", "Requête Multicritères"],
                          "datasets": [
                              {
                                  "label": "MongoDB (mémoire)",
                                  "data": [60, 70, 50, 65, 80],
                                  "backgroundColor": "rgba(54, 162, 235, 0.2)",
                                  "borderColor": "rgba(54, 162, 235, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "MongoDB (CPU)",
                                  "data": [30, 40, 25, 35, 45],
                                  "backgroundColor": "rgba(75, 192, 192, 0.2)",
                                  "borderColor": "rgba(75, 192, 192, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "Redis (mémoire)",
                                  "data": [40, 50, 30, 45, 60],
                                  "backgroundColor": "rgba(255, 99, 132, 0.2)",
                                  "borderColor": "rgba(255, 99, 132, 1)",
                                  "borderWidth": 1
                              },
                              {
                                  "label": "Redis (CPU)",
                                  "data": [20, 30, 15, 25, 35],
                                  "backgroundColor": "rgba(255, 159, 64, 0.2)",
                                  "borderColor": "rgba(255, 159, 64, 1)",
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
          </div>
      </div>
      <bt-rich-text-editor></bt-rich-text-editor>
      `;
  }
}
