mica-auto SPI、Spring boot stater Development Tools

Mica-auto is a basic component of the Spring Cloud microservices framework MICA, which is used to generate some basic configurations of the Spring Boot Starter.

Version Update Record

Principle
Mica Auto uses the Annotation Processor, which is not a new technology. It's been around since JDK 1.6. The Annotation Processor is a tool of javac that scans and processes annotations at compile time. Using the Annotation Processor, you can obtain information about annotations and annotated objects, and then automatically generate Java code based on annotations, eliminating manual writing and improving coding efficiency. Lombok is also famous for this technology.

Usage Scenarios
It is mainly used to avoid the inconsistency between the Spring Boot main project package and the subproject or submodule package, and avoid the problem that the package cannot be scanned.
Customize the Spring Boot starter.
Subprojects in a multi-module project (adding MICA-Auto to a master project is not recommended).

Functions
Automatically generate spring.factories, spring-devtools.properties configuration (spring Boot starter development tools).
Generate the FeignClient in the spring.factories for automated Feign configuration in the mica-cloud. 
Generate the Java Spi configuration, you need to add the @AutoService annotation.
Annotation                     spring.factories 或 Spi key
@AutoContextInitializer               ApplicationContextInitializer
@AutoListener                       ApplicationListener
@AutoRunListener                   SpringApplicationRunListener
@AutoEnvPostProcessor               EnvironmentPostProcessor
@AutoFailureAnalyzer                FailureAnalyzer
@AutoConfigImportFilter              AutoConfigurationImportFilter
@AutoTemplateProvider               TemplateAvailabilityProvider
@AutoEnableCircuitBreaker            EnableCircuitBreaker
@AutoConfigDataLocationResolver      ConfigDataLocationResolver
@AutoConfigDataLoader               ConfigDataLoader
@Component                        EnableAutoConfiguration
@AutoIgnore                  Ignore and do not generate to spring.factories
@AutoService                       java Spi generates the configuration

Usage
Note: If you are using Lombok in your project, place the mica-Auto dependency behind Lombok
maven
<dependency> <groupId>net.dreamlu</groupId>
<artifactId>mica-auto</artifactId> <version>2.1.0</version>
<scope>provided</scope></dependency>
gradle >= 5.x
annotationProcessor("net.dreamlu:mica-auto:2.1.0")
gradle < 5.x
compileOnly "net.dreamlu:mica-auto:2.1.0"

Principle
Scan @component, automatically generate the corresponding configuration, and support composite annotations.

Mica Ecological
mica (Spring cloud micro service component): https://gitee.com/596392912/mica
mica-auto (Spring boot starter development tools): https://gitee.com/596392912/mica-auto
mica-weixin （ jfinal weixin’s spring boot starter ）：
https://gitee.com/596392912/mica-weixin
mica-mqtt （mqtt component based on t-io implementation）：
https://gitee.com/596392912/mica-mqtt
Spring cloud Microservice  http2 solution（ h2c ）:
https://gitee.com/596392912/spring-cloud-java11

Open Source Licenses
LGPL（GNU Lesser General Public License）
The LGPL is an open source protocol of the GPL designed primarily for use by class libraries. Unlike the GPL, which requires that any software that uses/modifiers/derived from a GPL class library must use the GPL. The LGPL allows commercial software to use LGPL libraries via library references without requiring open source commercial software code. This allows LGPL open source code to be referenced by commercial software as a class library and distributed and sold.
However, if you modify LGPL code or derivative, all modified code, additional code and derivative code involving the modification must be in LGPL. Therefore, LGPL open source code is suitable for commercial software to reference as a third-party class library, but not suitable for commercial software that wants to do secondary development through modification and derivation on the basis of LGPL code.

The User’s Rights
Allow to introduce the source code in the form of free for study, graduation, corporate projects, private work, etc.
Modify the code in special cases, but still want to close the source must be approved by the author.
For reference, please specify: refer to mica-auto: https://github.com/lets-mica/mica-auto

References
Google Auto: https://github.com/google/auto
Spring 5 - spring-context-indexer：
https://github.com/spring-projects/spring-framework/tree/master/spring-co
ntext-indexer

WeChat Official Account

