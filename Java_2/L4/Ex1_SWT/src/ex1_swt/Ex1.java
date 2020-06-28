/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class Ex1 {
  public static void main(String[] args) {
    Display display = new Display();
    Shell shell = new Shell(display);
    RowLayout layout = new RowLayout(SWT.VERTICAL);
    layout.marginLeft = 12;
    layout.marginTop = 0;
    layout.justify = true;
    shell.setLayout(layout);
//    shell.setLayout(new FillLayout());
    new Button(shell, SWT.PUSH).setText("one");
    new Button(shell, SWT.PUSH).setText("two");
    new Button(shell, SWT.PUSH).setText("three");
    new Button(shell, SWT.PUSH).setText("four");
    new Button(shell, SWT.PUSH).setText("five");
    new Button(shell, SWT.PUSH).setText("six");
    Button b = new Button(shell, SWT.PUSH);
    b.setText("seven");
    b.setLayoutData(new RowData(100, 100));

    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }
    display.dispose();
  }
}
