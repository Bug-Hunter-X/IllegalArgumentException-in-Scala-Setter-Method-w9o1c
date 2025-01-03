# IllegalArgumentException in Scala Setter Method

This repository demonstrates a common error in Scala: throwing an `IllegalArgumentException` within a setter method due to insufficient input validation.  The `bug.scala` file contains the buggy code, while `bugSolution.scala` provides a corrected version.

The original code throws an exception when attempting to set a negative age, which is a reasonable validation requirement. The solution improves the exception handling for better error reporting.