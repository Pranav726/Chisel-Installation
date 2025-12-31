module Counter(
  input clock,
  input reset,
  output [7:0] out
);

  reg [7:0] count;

  always @(posedge clock) begin
    if (reset)
      count <= 8'h0;
    else
      count <= count + 8'h1;
  end

  assign out = count;

endmodule
