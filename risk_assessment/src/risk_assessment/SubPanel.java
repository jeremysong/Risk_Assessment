package risk_assessment;

import javax.swing.*;

public class SubPanel {
	JPanel current = new JPanel();
	JTextField node_weight_value = new JTextField();
	JTextField FW = new JTextField();
	JTextField IP = new JTextField();
	JTextField AV = new JTextField();
	JTextField SIT = new JTextField();
	JTextField IMP = new JTextField();
	JTextField SG = new JTextField();
	public SubPanel()
	{
//		current.setBounds(0, 0, 800, 400);
		current.setLayout(null);
		current.setOpaque(true);
		
		JLabel node_weight = new JLabel("Node Weight:");
		node_weight.setBounds(20, 20, 100, 20);
		node_weight_value.setBounds(110, 20, 100, 20);
		
		JLabel node_service = new JLabel("Node Service Risk");
		node_service.setBounds(40, 50, 200, 20);
		
		JLabel FW_label = new JLabel("Fire Wall:");
		FW_label.setBounds(20, 80, 100, 20);
		FW.setBounds(110, 80, 100, 20);
		
		JLabel IP_label = new JLabel("IPS:");
		IP_label.setBounds(20,110,100,20);
		IP.setBounds(110, 110, 100, 20);
		
		JLabel AV_label = new JLabel("Anti-Virus:");
		AV_label.setBounds(20, 140, 100, 20);
		AV.setBounds(110, 140, 100, 20);
		
		JLabel SIT_label = new JLabel("SIT:");
		SIT_label.setBounds(20, 170, 100, 20);
		SIT.setBounds(110, 170, 100, 20);
		
		JLabel impact_label = new JLabel("Threat Impact:");
		impact_label.setBounds(270, 140, 100, 20);
		IMP.setBounds(370, 140, 100, 20);
		
		JLabel security_guard = new JLabel("Security Guard:");
		security_guard.setBounds(270, 170, 100, 20);
		SG.setBounds(370,170,100,20);
		
		current.add(node_weight_value);
		current.add(node_weight);
		current.add(node_service);
		current.add(FW_label);
		current.add(FW);
		current.add(IP_label);
		current.add(IP);
		current.add(AV_label);
		current.add(AV);
		current.add(SIT_label);
		current.add(SIT);
		current.add(impact_label);
		current.add(IMP);
		current.add(security_guard);
		current.add(SG);
	}
	
	JPanel getPanel()
	{
		return current;
	}
	
}
