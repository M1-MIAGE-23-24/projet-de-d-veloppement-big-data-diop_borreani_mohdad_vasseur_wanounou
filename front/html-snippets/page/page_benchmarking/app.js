import Content from  './content.js';
import Style from  './style.js';

class Page extends HTMLElement {

    html;
    style;

    static get observedAttributes() {
        return [];
    }

    connectedCallback() {
        // -----------------------------------------------------------
        // [Rando]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkRandonneeUpdate").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/update`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/update`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [Rando]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkRandonneeGet").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/get`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/get`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [Rando]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkRandonneeDelete").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/delete`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/delete`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [Rando]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkRandonneeCreate").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/create`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/randonne/mongo/benchmark/create`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [Avis]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkAvisUpdate").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/update`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/update`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [Avis]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkAvisGet").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/get`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/get`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [Avis]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkAvisDelete").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/delete`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/delete`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [Avis]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkAvisCreate").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/create`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/avis/mongo/benchmark/create`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });










        // -----------------------------------------------------------
        // [PointInteret]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkPointInteretUpdate").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/update`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/update`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [PointInteret]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkPointInteretGet").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/get`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/get`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [PointInteret]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkPointInteretDelete").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/delete`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/delete`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });
        // -----------------------------------------------------------
        // [PointInteret]
        // -----------------------------------------------------------
        this.shadow.getElementById("boutonBenchmarkPointInteretCreate").addEventListener("click", async () => {
            var data = "";
            // Résultat sur MongoDB
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/create`,{method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}`);
                }
                data = data + `Mongo : ${await reponse.text()}<br><br>`;
            } catch (e) {
                data = data + `Mongo : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            // Résultat sur Redis
            try {
                const reponse = await fetch(`http://localhost:8080/pointInteret/mongo/benchmark/create`, {method: "get",});
                if(!reponse.ok){
                    throw new Error(`Erreur lors de la récupération des données : ${reponse.status}<br><br>`);
                }
                data = data + `Redis : ${await reponse.text()}<br><br>`;} 
            catch (e) {
            data = data + `Redis : Erreur lors de la récupération des données: ${e}<br><br>`;
            }
            //
            this.shadow.getElementById("contentPopup").innerHTML =  data;
            this.shadow.getElementById("popupGlobal").style.display = "flex";
        });



        // -----------------------------------------------------------
        // Gestion de la fermeture de la popup
        // -----------------------------------------------------------
        this.shadow.getElementById("popup1").addEventListener("click",() => {
            this.shadow.getElementById("popupGlobal").style.display = "none";
        });
        

    }
    
    constructor(){
        super();
        this.html = new Content();
        this.style = new Style();
        this.shadow = this.attachShadow({ mode: 'open' });
        this.shadow.innerHTML = this.style.content() + " " + this.html.content();
    }
}

customElements.define('page-benchmarking', Page);

