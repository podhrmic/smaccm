#ifndef __SMACCM_receiver_types__H
#define __SMACCM_receiver_types__H

#include <smaccm_test_irq1_impl_types.h>

/**************************************************************************
  Copyright (c) 2013, 2014, 2015 Rockwell Collins and the University of Minnesota.
  Developed with the sponsorship of the Defense Advanced Research Projects Agency (DARPA).

  Permission is hereby granted, free of charge, to any person obtaining a copy of this data,
  including any software or models in source or binary form, as well as any drawings, specifications, 
  and documentation (collectively "the Data"), to deal in the Data without restriction, including 
  without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
  and/or sell copies of the Data, and to permit persons to whom the Data is furnished to do so, 
  subject to the following conditions: 

  The above copyright notice and this permission notice shall be included in all copies or
  substantial portions of the Data.

  THE DATA IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
  LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
  IN NO EVENT SHALL THE AUTHORS, SPONSORS, DEVELOPERS, CONTRIBUTORS, OR COPYRIGHT HOLDERS BE LIABLE 
  FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
  ARISING FROM, OUT OF OR IN CONNECTION WITH THE DATA OR THE USE OR OTHER DEALINGS IN THE DATA. 

 **************************************************************************/


/**************************************************************************

   File: C:\docs\git_smaccm\smaccm\models\Trusted_Build_Test\test_irq1_eChronos\gen\smaccm_receiver.h
   Created on: 2015/07/27 13:39:14
   using Dulcimer AADL system build tool suite 

   ***AUTOGENERATED CODE: DO NOT MODIFY***

  This header section contains the AADL gluecode interfaces used by the client
  for the thread implementations.

 **************************************************************************/
	// These are functions that are expected to be provided by the user.
	void ping_received(const uint32_t * Input1); 



	// These are functions that are provided by the AADL middleware for 
	// communication with other threads
	bool receiver_read_Input1(uint32_t * Input1); 
	
/* endif for: #ifndef __SMACCM_receiver_types__H */
#endif

/**************************************************************************
  End of autogenerated file: C:\docs\git_smaccm\smaccm\models\Trusted_Build_Test\test_irq1_eChronos\gen\smaccm_receiver.h
 **************************************************************************/

