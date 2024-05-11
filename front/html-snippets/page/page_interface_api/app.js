import Content from  './content.js';
import Style from  './style.js';

class Page extends HTMLElement {

    html;
    style;

    static get observedAttributes() {
        return [];
    }

    connectedCallback() {

        this.shadow.getElementById("eee").addEventListener("click", 
            () => {
                console.log(this.shadow.getElementById("ttt").getValue());
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

