void main() {
    IO.print("name : ");
    String name = IO.readln();

    IO.println("name : %s".formatted(name));

    String hobby = IO.readln("hobby : ");

    IO.println("hobby : %s".formatted(hobby));
}