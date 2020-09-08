package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections.sort 数组按指定字段的排序
 */
public class CollectionsSort {
    public static void main(String[] args) {
        System.out.println("你好！！！");
        List<Grade> grades = new ArrayList<>();
        Grade A = new Grade(70, 80, 90);
        Grade B = new Grade(80, 90, 70);
        Grade C = new Grade(90, 70, 80);
        grades.add(A);
        grades.add(B);
        grades.add(C);
        //实现方式一
//        Collections.sort(grades, (o1, o2) -> (o1.getDance() - o2.getDance()));
        //实现方式二
        Collections.sort(grades, Comparator.comparing(Grade::getDance));
//        Collections.sort(grades, Comparator.comparing(o -> o.get).thenComparing(o -> o.ge));
        for (Grade grade : grades) {
            System.out.println(grade.toString());
        }
        /**
         * "C:\Program Files\Java\jdk1.8.0_73\bin\java.exe" -javaagent:D:\java-applications\IDEA\lib\idea_rt.jar=63078:D:\java-applications\IDEA\bin -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_73\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_73\jre\lib\rt.jar;D:\idea-projects-mpms\demo\target\test-classes;D:\idea-projects-mpms\demo\target\classes;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-starter-web\2.2.0.RELEASE\spring-boot-starter-web-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-starter\2.2.0.RELEASE\spring-boot-starter-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot\2.2.0.RELEASE\spring-boot-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-autoconfigure\2.2.0.RELEASE\spring-boot-autoconfigure-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-starter-logging\2.2.0.RELEASE\spring-boot-starter-logging-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\logging\log4j\log4j-to-slf4j\2.12.1\log4j-to-slf4j-2.12.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\logging\log4j\log4j-api\2.12.1\log4j-api-2.12.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\slf4j\jul-to-slf4j\1.7.28\jul-to-slf4j-1.7.28.jar;D:\java-applications\maven3.6.0_idea_repository\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\yaml\snakeyaml\1.25\snakeyaml-1.25.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-starter-json\2.2.0.RELEASE\spring-boot-starter-json-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.10.0\jackson-datatype-jdk8-2.10.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.10.0\jackson-datatype-jsr310-2.10.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.10.0\jackson-module-parameter-names-2.10.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-starter-tomcat\2.2.0.RELEASE\spring-boot-starter-tomcat-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.27\tomcat-embed-core-9.0.27.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.27\tomcat-embed-el-9.0.27.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.27\tomcat-embed-websocket-9.0.27.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-starter-validation\2.2.0.RELEASE\spring-boot-starter-validation-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\jakarta\validation\jakarta.validation-api\2.0.1\jakarta.validation-api-2.0.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\hibernate\validator\hibernate-validator\6.0.17.Final\hibernate-validator-6.0.17.Final.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\jboss\logging\jboss-logging\3.4.1.Final\jboss-logging-3.4.1.Final.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\fasterxml\classmate\1.5.0\classmate-1.5.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-web\5.2.0.RELEASE\spring-web-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-beans\5.2.0.RELEASE\spring-beans-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-webmvc\5.2.0.RELEASE\spring-webmvc-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-aop\5.2.0.RELEASE\spring-aop-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-context\5.2.0.RELEASE\spring-context-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-expression\5.2.0.RELEASE\spring-expression-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-starter-test\2.2.0.RELEASE\spring-boot-starter-test-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-test\2.2.0.RELEASE\spring-boot-test-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\boot\spring-boot-test-autoconfigure\2.2.0.RELEASE\spring-boot-test-autoconfigure-2.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\jayway\jsonpath\json-path\2.4.0\json-path-2.4.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\net\minidev\json-smart\2.3\json-smart-2.3.jar;D:\java-applications\maven3.6.0_idea_repository\repository\net\minidev\accessors-smart\1.2\accessors-smart-1.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\ow2\asm\asm\5.0.4\asm-5.0.4.jar;D:\java-applications\maven3.6.0_idea_repository\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.2\jakarta.xml.bind-api-2.3.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\jakarta\activation\jakarta.activation-api\1.2.1\jakarta.activation-api-1.2.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\junit\jupiter\junit-jupiter\5.5.2\junit-jupiter-5.5.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\junit\jupiter\junit-jupiter-api\5.5.2\junit-jupiter-api-5.5.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\junit\platform\junit-platform-commons\1.5.2\junit-platform-commons-1.5.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\junit\jupiter\junit-jupiter-params\5.5.2\junit-jupiter-params-5.5.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\junit\jupiter\junit-jupiter-engine\5.5.2\junit-jupiter-engine-5.5.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\junit\vintage\junit-vintage-engine\5.5.2\junit-vintage-engine-5.5.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apiguardian\apiguardian-api\1.1.0\apiguardian-api-1.1.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\junit\platform\junit-platform-engine\1.5.2\junit-platform-engine-1.5.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\junit\junit\4.12\junit-4.12.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\mockito\mockito-junit-jupiter\3.1.0\mockito-junit-jupiter-3.1.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\assertj\assertj-core\3.13.2\assertj-core-3.13.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\hamcrest\hamcrest\2.1\hamcrest-2.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\mockito\mockito-core\3.1.0\mockito-core-3.1.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\net\bytebuddy\byte-buddy\1.10.1\byte-buddy-1.10.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\net\bytebuddy\byte-buddy-agent\1.10.1\byte-buddy-agent-1.10.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\objenesis\objenesis\2.6\objenesis-2.6.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\skyscreamer\jsonassert\1.5.0\jsonassert-1.5.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-core\5.2.0.RELEASE\spring-core-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-jcl\5.2.0.RELEASE\spring-jcl-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\springframework\spring-test\5.2.0.RELEASE\spring-test-5.2.0.RELEASE.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\xmlunit\xmlunit-core\2.6.3\xmlunit-core-2.6.3.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\bjucloud\mq\client\mq-client-java\1.0.2\mq-client-java-1.0.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\github\sgroschupf\zkclient\0.1\zkclient-0.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\zookeeper\zookeeper\3.3.3\zookeeper-3.3.3.jar;D:\java-applications\maven3.6.0_idea_repository\repository\jline\jline\0.9.94\jline-0.9.94.jar;D:\java-applications\maven3.6.0_idea_repository\repository\log4j\log4j\1.2.14\log4j-1.2.14.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\activemq\activemq-all\5.10.0\activemq-all-5.10.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\commons-httpclient\commons-httpclient\3.1\commons-httpclient-3.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\commons-logging\commons-logging\1.0.4\commons-logging-1.0.4.jar;D:\java-applications\maven3.6.0_idea_repository\repository\commons-codec\commons-codec\1.13\commons-codec-1.13.jar;D:\java-applications\maven3.6.0_idea_repository\repository\commons-io\commons-io\2.6\commons-io-2.6.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\poi\poi-ooxml\3.17\poi-ooxml-3.17.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\poi\poi\3.17\poi-3.17.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\commons\commons-collections4\4.1\commons-collections4-4.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\poi\poi-ooxml-schemas\3.17\poi-ooxml-schemas-3.17.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\apache\xmlbeans\xmlbeans\2.6.0\xmlbeans-2.6.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\stax\stax-api\1.0.1\stax-api-1.0.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\github\virtuald\curvesapi\1.04\curvesapi-1.04.jar;D:\java-applications\maven3.6.0_idea_repository\repository\cn\hutool\hutool-all\4.1.19\hutool-all-4.1.19.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\alibaba\fastjson\1.2.54\fastjson-1.2.54.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\sun\mail\javax.mail\1.6.2\javax.mail-1.6.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\javax\activation\activation\1.1\activation-1.1.jar;D:\java-applications\maven3.6.0_idea_repository\repository\commons-lang\commons-lang\2.6\commons-lang-2.6.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\jsoup\jsoup\1.11.2\jsoup-1.11.2.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\fasterxml\jackson\core\jackson-databind\2.10.0\jackson-databind-2.10.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\fasterxml\jackson\core\jackson-annotations\2.10.0\jackson-annotations-2.10.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\com\fasterxml\jackson\core\jackson-core\2.10.0\jackson-core-2.10.0.jar;D:\java-applications\maven3.6.0_idea_repository\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\java-applications\maven3.6.0_idea_repository\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\java-applications\maven3.6.0_idea_repository\repository\org\slf4j\slf4j-api\1.7.28\slf4j-api-1.7.28.jar" com.example.demo.Test22
         * 你好！！！
         * Grade{music=90, dance=70, sports=80}
         * Grade{music=70, dance=80, sports=90}
         * Grade{music=80, dance=90, sports=70}
         */
    }

    static class Grade {
        private Integer music;
        private Integer dance;
        private Integer sports;

        public Grade(Integer music, Integer dance, Integer sports) {
            this.music = music;
            this.dance = dance;
            this.sports = sports;
        }

        public Integer getMusic() {
            return music;
        }

        public void setMusic(Integer music) {
            this.music = music;
        }

        public Integer getDance() {
            return dance;
        }

        public void setDance(Integer dance) {
            this.dance = dance;
        }

        public Integer getSports() {
            return sports;
        }

        public void setSports(Integer sports) {
            this.sports = sports;
        }

        @Override
        public String toString() {
            return "Grade{" +
                    "music=" + music +
                    ", dance=" + dance +
                    ", sports=" + sports +
                    '}';
        }
    }
}
