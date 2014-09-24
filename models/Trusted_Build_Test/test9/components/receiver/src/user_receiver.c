#include <smaccm_receiver.h>

void periodic_ping(/* const */uint32_t periodic_1000_ms) {
	test9__a_array_impl test_data;
	
	printf("receiver: periodic dispatch received at time: %d", periodic_1000_ms); 
    printf("receiver: checking value of test_data on Input1 \n");
    ping_Input1(&test_data);
    printf("receiver: ping_received invoked (%d, %d, %d, %d)\n", test_data[0], test_data[1], test_data[2], test_data[3]);
}