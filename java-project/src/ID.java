class ID {
    final int NUMBER;	// 상수지만 초기화 하지 않고
    final String NAME;	// 생성자에서 단 한 번만 초기화 가능

    ID(String name, int number) {
        NUMBER = number;
        NAME = name;
    }
}