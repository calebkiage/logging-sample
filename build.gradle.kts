plugins {
  java
  id("org.springframework.boot") version "2.2.6.RELEASE"
  id("io.spring.dependency-management") version "1.0.9.RELEASE"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

ext["logback.version"] = "1.2.3"

java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter")
  implementation("org.springframework.boot:spring-boot-starter-web")

  runtimeOnly("net.logstash.logback:logstash-logback-encoder:6.3")

  testImplementation("org.springframework.boot:spring-boot-starter-test") {
    exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.withType<Wrapper> {
  distributionType = Wrapper.DistributionType.BIN
  gradleVersion = "6.3"
}

