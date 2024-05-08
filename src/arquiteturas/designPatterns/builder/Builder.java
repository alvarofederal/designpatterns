package arquiteturas.designPatterns.builder;

//Interface do Builder
interface Builder {
 void buildPart1();
 void buildPart2();
 void buildPart3();
 Product getResult();
}
