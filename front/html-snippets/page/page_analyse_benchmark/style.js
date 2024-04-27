export default class Style{
    content(){ return `
    
    <style>
    :host {
      width: 100%;
  }

  .divGlobal{
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    width: 100%;
  }
  .divAnnalyseBenchmark {
    display: flex;
    max-width: 800px;
    justify-content: center;
    align-items: center;

    margin-top: 20px;
    flex-direction: column;


  }

  .char1{

        --bt-background-color: #ffffff; 
  }

  
</style>
    `
    }
}