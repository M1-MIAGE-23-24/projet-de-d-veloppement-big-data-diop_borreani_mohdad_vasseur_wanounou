J'ai configuré la partie MongoDB et je n'ai pas touché tout ce qui est Redis. Par ailleurs je mettrai des notes au besoin pour que Ralph, tu en fasse des ajustements.

Tout d'abord, je vous invite tous à regarder la vidéo explicative du prof dans le canal Base de données de discord.

La base de données s'appelle : ``Randonnes``

Partant sur les explications du prof, j'ai créé dans ``repositories`` deux package : ``Mongo`` et ``Redis``. @Ralph, je te laisse compléter la partie ``Redis``.

J'ai également ajusté, toujours dans le répertoire ``repositories``, les interfaces ``NomDeLaTableRepository`` en suivant les explications du prof.

Parfois je vois //JPA, ça sert à quoi ? 

Pour la connection à la base de données, le mieux est d'utiliser IntelliJ et se connecter directement, donc revoir la partie : configuration de connexion dans ``ressources : application.properties``.

J'ai créé des scripts python qui permettent de générer les 100 000 données pour chaque table ou collection afin de les insérer dans les différentes BDD.
Ces données se trouvent dans ressources->scripts.


