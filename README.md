# SpringBoot-AOP27
CI vs DI +interceptor+CLR+oreder+Thread
</br>
CI- contracture injection</br>
CD -dependency injection </br>
@Qualifier vs @Primery annnotation </br>
@Scop(prototyp/singlton)</br>
interceptor :  implements BeanPostProcessor that has postProcessAfterInitialization and postProcessBeforInitialization </br>
@Requiredargsconstructor - Creating a constructor to reboot the class</br>
CLR -COMMAND LINE RUNNER implementation </br>
@Order(num)- affects the order of CLR operations 1.. 2.. 3..  sync by num </br>
</br>
# THREAD in springBoot </br>
@EnableAsync-help implimant asyncrunic methos</br>
@EnableScheduling -let me the option to run the method in specific time or frequency </br>
@Async- make method/class work as Thread</br>
1 @Scheduled(fixedRate=num milSec)</br>
or</br>
2 @Scheduled(cron) based on Unix time 






