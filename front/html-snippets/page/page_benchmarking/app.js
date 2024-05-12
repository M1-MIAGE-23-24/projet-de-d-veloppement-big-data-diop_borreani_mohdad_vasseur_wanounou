import Content from  './content.js';
import Style from  './style.js';

class Page extends HTMLElement {

    html;
    style;

    static get observedAttributes() {
        return [];
    }

    connectedCallback() {
        this.shadow.getElementById("boutonLectureRandonnee").addEventListener("click", 
        () => {
            this.shadow.getElementById("popupGlobal").style.display = "flex";

        });

        this.shadow.getElementById("boutonEcritureRandonnee").addEventListener("click", 
        () => {
            this.shadow.getElementById("popupGlobal").style.display = "flex";

        });

        this.shadow.getElementById("boutonSupressionRandonnee").addEventListener("click", 
        () => {
            this.shadow.getElementById("popupGlobal").style.display = "flex";

        });

        this.shadow.getElementById("boutonModificationRandonnee").addEventListener("click", 
        () => {
            this.shadow.getElementById("popupGlobal").style.display = "flex";

        });

        this.shadow.getElementById("popup1").addEventListener("click",
        () => {
            console.log("popup1");
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

