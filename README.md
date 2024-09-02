# jacoco-quarkus-multimodule

Run:

```shell
./mvnw clean verify
```

to run the tests and generate the jacoco report

There are reports for both modules:
![.maven_modules.png](.maven_modules.png)

But only for `child2`
![.only_child2.png](.only_child2.png)

`child1`'s report exists but it's not linked
![.child1_exists.png](.child1_exists.png)
