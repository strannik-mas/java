/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package su.strannik;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JComponent;

public class Graph extends JComponent{
	
	private int graphType = 2;
        private int []d = {2,3,5,12,24,33};
        private int max, scX, scY;
        private LinkedList<IGraphListener> list = null;
	
	public int getGraphType() {
		return graphType;
	}

	public void setGraphType(int graphType) {
		this.graphType = graphType;
		repaint();
	}
        
        private void solveGeom(){
            for(int i : d) {
                if (i > max) max = i;
            }
            
            scX = getWidth() / d.length;
            scY = getHeight() / max;
        }
        
        public void addIGraphListener(IGraphListener client){
            list.add(client);
        }
        
        public void removeIGraphListener(IGraphListener client){
            list.remove(client);
        }

	public Graph() {
            setName("Тест name");
            list = new LinkedList<IGraphListener>();
            
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    int i=0, y;
                    i = e.getX()/scX;
                    if (i<0) i=0;
                    if (i>d.length-1) i = d.length - 1;
                    
                    GraphData c = new GraphData(i, d[i], Graph.this);
                    for(IGraphListener cl : list) cl.coordinates(c);
                }
                
            });
	}
	
	@Override
	protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);

            g.drawString(getName(), getWidth()/2, 10);
                
            solveGeom();
            for(int i = 0; i<d.length; i++){
                if(graphType == 1)
                    g.fillRect(scX*i, getHeight() - scY*d[i], scX, scY*d[i]);
                else
                    g.fill3DRect(scX*i, getHeight() - scY*d[i], scX, scY*d[i], true);
            }
	}
}
