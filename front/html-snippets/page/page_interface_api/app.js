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
                console.log(this.shadow.getElementById("ttt").getValue());
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

customElements.define('page-interface-api', Page);

