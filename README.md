<h1>Informe de Pruebas y Cobertura - Proyecto Java</h1>
<h2>Objetivos</h2>
<p>El objetivo de este informe es evaluar la calidad del conjunto de pruebas, la cobertura del proyecto Java, y analizar el trabajo en equipo y el esfuerzo invertido en la actividad de prueba.</p>

<h2>Resumen del Proceso de Prueba</h2>
<ul>
    <li><strong>¿Se ha realizado trabajo en equipo?</strong>
        <p>Sí, el trabajo se realizó en equipo mediante, lo que permitió una colaboración efectiva para realizar las pruebas y mejorar la cobertura del proyecto ya que ambos estuvimos a la vez viendo el proyecto y dandonos ideas entre nosotros.</p>
    </li>
    <li><strong>¿Tiene calidad el conjunto de pruebas disponibles?</strong>
        <p>El conjunto de pruebas alcanzó una cobertura del 100% para las clases que se utilizan en el proyecto Java, las cuales son: DuplicatedInstanceException.java, NotFreeInstanceException.java, Reusable.java y ReusablePool.java.</p>
    </li>
    <li><strong>¿Cuál es el esfuerzo invertido en realizar la actividad?</strong>
        <p>Se realizó un esfuerzo significativo para alcanzar el 100% de cobertura en las clases mencionadas.</p>
    </li>
    <li><strong>¿Cuál es el número de fallos encontrados en el código original?</strong>
        <p>Se encontrarón tres fallos en las pruebas en el código original, ya que las pruebas no estaban implementadas y no tenían en cuenta el hecho de que estas pudiesen arrojar excepciones, cosa que se implemento dos de los tres tests.</p>
    </li>
    <li><strong>¿El proceso de integración continua realizado ha sido de calidad?</strong>
        <p>Sí, se utilizó GitHub Actions con Ant para realizar pruebas y verificación de cobertura con Codecov, lo que proporcionó un proceso de integración continua de calidad.</p>
    </li>
</ul>

<h2>Imágenes</h2>
<div style="display: flex; justify-content: space-around; align-items: center;">
    <div>
        <img src="https://github.com/MJGomezLopez/poolobject/assets/128587635/5794ef4a-54ce-407a-8dc2-f7b88cf26630" alt="Cobertura desde Codecov" style="max-width: 300px;">
        <p style="text-align: center;">Cobertura desde Codecov</p>
    </div>
    <div>
        <img src="https://github.com/MJGomezLopez/poolobject/assets/128587635/19c3cb04-7318-43f8-818b-a6de2062fade" alt="Cobertura desde JUnit - Eclipse" style="max-width: 300px;">
        <p style="text-align: center;">Cobertura desde JUnit - Eclipse</p>
    </div>
    <div>
        <img src="https://github.com/MJGomezLopez/poolobject/assets/128587635/adaf93f7-6359-4940-86f8-60f43deb2c26" alt="Test pasados de GitHub Actions" style="max-width: 300px;">
        <p style="text-align: center;">Test pasados de GitHub Actions</p>
    </div>
</div>








