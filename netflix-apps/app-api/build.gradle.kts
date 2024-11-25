dependencies {
    implementation(project(":netflix-core:core-usecase"))
    implementation(project(":netflix-commons"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}