# PocJmsArtemis

# para la construccion de esta POC 
# utilice java version 1.8
# spring boot starter artemis como dependencia de conexion a colas JMS
# el broker ActiveMq que use localmente lo descargue de https://activemq.apache.org/components/artemis/download/
# use una capa de Controller para enviar un String con un mensaje a la cola , ese mismo mensaje es escuchado por  el servicio de escucha . 
