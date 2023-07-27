package ListaAlmacenamientoDeDatos;

import javax.swing.JOptionPane;

public class ConvertirAlmacenamientoDeDatos {
	
	
		public void Bitabyte(double valor) {
			double bit = valor * 0.125;
			bit = (double)Math.round(bit);
			JOptionPane.showMessageDialog(null, valor + "  Bit es igual a " + bit + " Byte(B)" );
			
		}
	
		public void Kilobitakilobyte(double valor) {
			double kilobit = valor * 0.125;
			kilobit = (double)Math.round(kilobit);
			JOptionPane.showMessageDialog(null, valor + "  Bit es igual a " + kilobit + " Kilobyte(KB)" );
		}

		public void Megabitamegabyte(double valor) {
			double megabit = valor * 0.125;
			megabit = (double)Math.round(megabit);
			JOptionPane.showMessageDialog(null, valor + "  Bit es igual a " + megabit + " Megabyte(MB)" );
		}

		public void Gigabitagigabyte(double valor) {
			double gigabit = valor * 0.125;
			gigabit = (double)Math.round(gigabit);
			JOptionPane.showMessageDialog(null, valor + "  Bit es igual a " + gigabit + " Gigabyte(GB)" );
		}

		public void Terabitaterabyte(double valor) {
			double terabit = valor * 0.125;
			terabit = (double)Math.round(terabit);
			JOptionPane.showMessageDialog(null, valor + "  Bit es igual a " + terabit + " Terabyte(TB)" );
		}

		public void Petabitapetabyte(double valor) {
			double petabit = valor * 0.125;
			petabit = (double)Math.round(petabit);
			JOptionPane.showMessageDialog(null, valor + "  Bit es igual a " + petabit + " Petabyte(PB)" );
		
		}

		public void Exabitaexabyte(double valor) {
			double exabit = valor * 0.125;
			exabit = (double)Math.round(exabit);
			JOptionPane.showMessageDialog(null, valor + "  Bit es igual a " + exabit + " Exabyte(EB)" );
			
		}
		
		public void Byteabit(double valor) {
			double Byte = valor * 8;
			Byte = (double)Math.round(Byte);
			JOptionPane.showMessageDialog(null, valor + "  Byte(B) es igual a " + Byte + " Bit" );
			
		}
		
		public void Kilobyteakilobit(double valor) {
			double kilobyte = valor * 8;
			kilobyte = (double)Math.round(kilobyte);
			JOptionPane.showMessageDialog(null, valor + "  Kilobyte(KB) es igual a " + kilobyte + " Kilobit" );
		}

		public void Megabyteamegabit(double valor) {
			double megabyte = valor * 8;
			megabyte = (double)Math.round(megabyte);
			JOptionPane.showMessageDialog(null, valor + "  Megabyte(MB) es igual a " + megabyte + " Megabit" );
		}

		public void Gigabyteagigabit(double valor) {
			double gigabyte = valor * 8;
			gigabyte = (double)Math.round(gigabyte);
			JOptionPane.showMessageDialog(null, valor + "  Gigabyte(GB) es igual a " + gigabyte + " Gigabit" );
		}

		public void Terabyteaterabit(double valor) {
			double terabyte = valor * 8;
			terabyte = (double)Math.round(terabyte);
			JOptionPane.showMessageDialog(null, valor + "  Terabyte(TB) es igual a " + terabyte + " Terabit" );
		}

		public void Petabyteapetabit(double valor) {
			double petabyte = valor * 8;
			petabyte = (double)Math.round(petabyte);
			JOptionPane.showMessageDialog(null, valor + "  Petabyte(PB) es igual a " + petabyte + " Petabit" );
		
		}

		public void Exabyteaexabit(double valor) {
			double exabyte = valor * 8;
			exabyte = (double)Math.round(exabyte);
			JOptionPane.showMessageDialog(null, valor + "  Exabyte(EB) es igual a " + exabyte + " Exabit" ); 
	
	}

}
