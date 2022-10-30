package nl.multicode.elevenproof.generator.supplier.exception;

public class NegativeIntegerNotSupportedException extends RuntimeException {

  public NegativeIntegerNotSupportedException() {

    super("Negative integers are not accepted nor supported arguments.");
  }
}
