//We are going to implement a dictionary for the information of the counties in the Ohio state. For each county, we may use the following class to represent the main information:
//You need to be very carefully in implementing the copy constructor such that it is performing a deep copy of the input object due to the integer array FIPS.
//A dictionary for counties can be implemented as a singly linked list whose nodes represent the county information.
//Notice that you need to perform a deep copy for the object referenced by the input dictionary. We consider the FIPS codes as the keys. 
//For insertion, please make sure that you did a linear search before inserting the new node or replacing an existing one. For the key comparison, you need to compare two integer arrays.


class County {

String name; // county name
int[] FIPS; // FIPS code
String seat; // county seat
long population; // population number
double area; // area in sq mi.


// default constructor
County() {

}

// constructor for explicitly initialize every member variable
County(String Name, int[] FIPS, String Seat, long Population, double Area) {
super();
this.name = Name;
this.FIPS = FIPS;
this.seat = Seat;
this.population = Population;
this.area = Area;
}

// copy constructor
County(final County county) {
name = county.name;
seat = county.seat;
population = county.population;
area = county.area;
FIPS = new int[county.FIPS.length];
for (int i = 0; i < FIPS.length; i++) {
FIPS[i] = county.FIPS[i];
}
}
}

class Node {
County county_info; // the reference to the information of the county
Node next;

// default constructor
Node() {

}

// explicitly initialize every member variable by the user inputs
Node(final County info, final Node node) {
county_info = new County(info);
next = node;
}
}

class Dictionary {

    Node head;  // the reference to the head node

    // default constructor
    Dictionary() {
            }

    // copy constructor
    Dictionary(final Dictionary dictionary) {

        Node temp = dictionary.head;

        while (temp.next != null) {
            insert(new County(temp.county_info));
            temp = temp.next;
        }
        insert(new County(temp.county_info));
    }

    void insert(final County info) {

        Node new_node = new Node(info, null);

        if (head == null) {
            head = new_node;
        } 
        else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.county_info.FIPS[0] == info.FIPS[0]) {
                    temp.county_info.name = info.name;
                    temp.county_info.seat = info.seat;
                    temp.county_info.population = info.population;
                    temp.county_info.area = info.area;
                    return;
                } 
                else {
                    temp = temp.next;
                }
            }
            if (temp.county_info.FIPS[0] == info.FIPS[0]) {
                temp.county_info.name = info.name;
                temp.county_info.seat = info.seat;
                temp.county_info.population = info.population;
                temp.county_info.area = info.area;
                return;
            }
            temp.next = new_node;
        }
    }

    boolean delete(final int[] FIPS) {

        Node current = head;
        Node previous = current;
        

        while (current != null) 
        {
        	if (current.county_info.FIPS[0] == FIPS[0]) {

                head = current.next;
                return true;
            }

        	current = current.next;

            while (current.next != null) {
                if (current.county_info.FIPS[0] == FIPS[0]) {
                    previous.next = current.next;
                    return true;
                }
                previous = current;
                current = current.next;
            }

            if (previous == null) {
            	return false;
            	} 
            else {
            	previous.next = current.next;
            	current.next = null;
            	}
        }
        return false;
    }

    void display() {
        if (head == null) {
            System.out.println("There is no data to display.");
        } else {
            Node temp = head;
            int c = 1;

            while (temp.next != null) {
                System.out.println("County " + c + " - Name: " + temp.county_info.name + ",  Fips: " + temp.county_info.FIPS[0] + ",  Seat: " + temp.county_info.seat + ",  Population: " + temp.county_info.population + ",  Area: " + temp.county_info.area);
                temp = temp.next;
                c=c+1;
            }
            
            System.out.println("County " + c + " - Name: " + temp.county_info.name + ",  Fips: " + temp.county_info.FIPS[0] + ",  Seat: " + temp.county_info.seat + ",  Population: " + temp.county_info.population + ",  Area: " + temp.county_info.area + "\n\n");
            
        }
    }
}


class Test
{
	public static void main(String args[])  
	{
		
		Dictionary list2020 = new Dictionary();
		County county1 = new County("Butler", new int[] {17}, "Hamilton", 368130, 467.27);
		list2020.insert(county1);
		County county2 = new County("Clinton", new int[] {27}, "Wilmington", 42040, 410.88);
		list2020.insert(county2);
		County county3 = new County("Cuyahoga", new int[]{35}, "Cleveland", 1249352, 458.49);
		list2020.insert(county3);
		County county4 = new County("Franklin", new int[]{49}, "Columbus", 1264518, 539.87);
		list2020.insert(county4);
		County county5 = new County("Hamilton", new int[]{61}, "Cincinnati", 802374, 407.36);
		list2020.insert(county5);
		County county6 = new County("Montgomery", new int[]{113}, "Dayton", 535153, 461.68);
		list2020.insert(county6);
		list2020.display();
		
		System.out.println("Population in all counties in list2021 raised by 6%");
		Dictionary list2021 = new Dictionary(list2020);
	       Node node = list2021.head;
	       while (node != null) {
	           double pop = node.county_info.population * 1.06;
	           int population = (int) pop;
	           County county2021 = new County(node.county_info.name, node.county_info.FIPS, node.county_info.seat, population, node.county_info.area);
	           list2021.insert(county2021);
	           node = node.next;
	       }
	       list2021.display();
	       
	       Dictionary list2022 = new Dictionary(list2021);
	       County county7 = new County(county5.name, county5.FIPS, county5.seat, county1.population + county5.population, county1.area + county5.area);
	       list2022.delete(county1.FIPS);
	       list2022.insert(county7);
	       
	       System.out.println("After the merged county in list2022");
	       list2022.display();
	}
}
	