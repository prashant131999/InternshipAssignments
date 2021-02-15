FROM openjdk:15
COPY . out/production/InternshipAssignments/dictionaryimplementation
WORKDIR /out/production/InternshipAssignments/dictionaryimplementation

RUN javac src/main/java/dictionaryimplementation/Dictionary.java
CMD ["java","Dictionary"]