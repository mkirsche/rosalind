problem="$1"
name=$(printf "%03d" $problem)
javac "p$name.java"
java "p$name"
