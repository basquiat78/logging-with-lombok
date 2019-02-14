# logging-with-lombok
spring boot2, lombok, slf4j    
    
    
# simple-logging    
회사에서 ICO와 관련 서버에서 로깅 관련 이슈가 발생했다.    
그러다가 간단한 방식으로 그리고 반복되는 코드를 없애고 단순하게 lombok에서 제공하는 어노테이션만으로도 로깅을 할 수 있어서 적용하기 전에 프로토타입으로 작성한 프로젝트이다.    
    
<code>
private static final Logger log = LoggerFactory.getLogger(Clazz.class);
</code>
    
이런 코드들이 사라졌다.    
    
       
# issue    
개인적으로 로그를 날짜별로 파일을 분리해서 기록하고 싶은데 application.yml의 속성만으로는 방법이 없어 보인다.    
만일 적용을 해본다면 logback-spring.xml, logback.xml에 fileNamePattern을 설정해서 불러오는 방법이 있을거 같은데 일단은 요청은 로그 파일을 남기는 것이 주 목적.    
