package test;

/**
 * Describes the Request-for-Enhancement (RFE) annotation type.
 */
public @interface Task {
    int id();
    String synopsis();
    String engineer() default "unassigned";
    String date() default "[unknown]";
}
