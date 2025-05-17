package br.edu.fatecgru.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecgru.dao.LeitorDAO;
import br.edu.fatecgru.model.Leitor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigoLeitor;
	private JTextField txtNomeLeitor;
	private JLabel lblNomeDoLeitor;
	private JLabel lblTipoDoLeitor;
	private JComboBox cmbTipoLeitor;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnAlterar;
	private JButton btnConsultar;
	private JButton btnExcluir;
	private JButton btnListar;
	private JLabel lblMensagem;
	private TextArea txtListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("Manutenção Leitor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código do Leitor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(57, 45, 131, 22);
		contentPane.add(lblNewLabel);
		
		txtCodigoLeitor = new JTextField();
		txtCodigoLeitor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCodigoLeitor.setBounds(243, 45, 252, 25);
		contentPane.add(txtCodigoLeitor);
		txtCodigoLeitor.setColumns(10);
		
		txtNomeLeitor = new JTextField();
		txtNomeLeitor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNomeLeitor.setColumns(10);
		txtNomeLeitor.setBounds(243, 76, 252, 25);
		contentPane.add(txtNomeLeitor);
		
		lblNomeDoLeitor = new JLabel("Nome do Leitor");
		lblNomeDoLeitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNomeDoLeitor.setBounds(57, 76, 122, 22);
		contentPane.add(lblNomeDoLeitor);
		
		lblTipoDoLeitor = new JLabel("Tipo do Leitor");
		lblTipoDoLeitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDoLeitor.setBounds(57, 108, 111, 22);
		contentPane.add(lblTipoDoLeitor);
		
		cmbTipoLeitor = new JComboBox();
		cmbTipoLeitor.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção", "Aluno", "Professor", "Administrativo"}));
		cmbTipoLeitor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cmbTipoLeitor.setBounds(243, 107, 252, 27);
		contentPane.add(cmbTipoLeitor);
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//=========================
				txtNomeLeitor.setText(null);
				txtCodigoLeitor.setText(null);
				lblMensagem.setText(null);
				cmbTipoLeitor.setSelectedIndex(0);
			//=========================	
			}
		});
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNovo.setBounds(38, 169, 89, 36);
		contentPane.add(btnNovo);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//=========================	
				try {
					// criei o objeto leitor
					Leitor leitor = new Leitor();
					leitor.setCodLeitor(Integer.parseInt(txtCodigoLeitor.getText()));
					leitor.setNomeLeitor(txtNomeLeitor.getText());
					leitor.setTipoLeitor((String) cmbTipoLeitor.getSelectedItem());
					// abrir conexão
					LeitorDAO dao = new LeitorDAO();
					// salvar
					dao.salvar(leitor);
					lblMensagem.setText("Salvo com Sucesso!");
				} catch (Exception e1) {
					lblMensagem.setText("Erro ao Salvar");
				}

			//=========================	
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalvar.setBounds(137, 169, 97, 36);
		contentPane.add(btnSalvar);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlterar.setBounds(244, 169, 100, 36);
		contentPane.add(btnAlterar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConsultar.setBounds(354, 169, 116, 36);
		contentPane.add(btnConsultar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(480, 169, 97, 36);
		contentPane.add(btnExcluir);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnListar.setBounds(587, 169, 89, 36);
		contentPane.add(btnListar);
		
		lblMensagem = new JLabel("");
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMensagem.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 255, 255), new Color(0, 0, 0)));
		lblMensagem.setBounds(10, 432, 734, 23);
		contentPane.add(lblMensagem);
		
		txtListar = new TextArea();
		txtListar.setBounds(10, 217, 734, 206);
		contentPane.add(txtListar);
	}
}
