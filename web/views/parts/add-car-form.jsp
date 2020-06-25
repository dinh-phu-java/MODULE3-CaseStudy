<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-12">
                <h1>Add Car</h1>
            </div>
        </div>
    </div><!-- /.container-fluid -->
</section>

<!-- Main content -->
<section class="content">
    <div class="row">
        <div class="col-md-12">
            <form action="product-controller" method="POST">
                <input type="text" name="action" value="add-car">
                <div class="form-group">
                    <label>Engine Type</label>
                    <select name="engine_type" class="form-control">
                        <option value="Twin Cylinder">Twin Cylinder</option>
                        <option value="Three Cylinder">Three Cylinder</option>
                        <option value="Four Cylinder">Four Cylinder</option>
                    </select>
                </div>

                <div class="form-group">
                    <label>Gear Type</label>
                    <select name="gear" class="form-control">
                        <option value="mt">MT</option>
                        <option value="at">AT</option>
                        <option value="cvt">CVT</option>
                        <option value="dct">DCT</option>
                    </select>
                </div>

                <div class="form-group">
                    <label>Front Wheel</label>
                    <select name="front-wheel" class="form-control">
                        <option value="fwd">FWD</option>
                        <option value="rwd">RWD</option>
                        <option value="awd">AWD</option>
                    </select>
                </div>

                <div class="form-group">
                    <label>Fuel Type</label>
                    <select name="fuel-type" class="form-control">
                        <option value="gasoline">Gasoline</option>
                        <option value="diesel">Diesel</option>
                        <option value="liquefied">Liquefied</option>
                        <option value="petroleum">Petroleum</option>
                        <option value="compressed">Compressed</option>
                        <option value="natural gas">Natural Gas</option>
                        <option value="ethanol">Ethanol</option>
                    </select>
                </div>

                <div class="form-group">
                    <label>Valves</label>
                    <select name="valves" class="form-control">
                        <option value="gasoline">Gasoline</option>
                        <option value="diesel">Diesel</option>
                        <option value="liquefied">Liquefied</option>
                        <option value="petroleum">Petroleum</option>
                        <option value="compressed">Compressed</option>
                        <option value="natural gas">Natural Gas</option>
                        <option value="ethanol">Ethanol</option>
                    </select>
                </div>

                <div class="form-group">
                    <label >Car Price</label>
                    <input type="text" class="form-control" name="price" placeholder="Price">
                </div>

                <div class="form-group">
                    <label >Date Of Manufacture</label>
                    <input type="date" name="date_of_manufacture" class="form-control" >
                </div>

                <div class="form-group">
                    <label >Vendor</label>
                    <input type="text" name="vendor" class="form-control" >
                </div>

                <div class="form-group">
                    <label >Car Type</label>
                    <input type="text" name="car_type" class="form-control" >
                </div>

                <div class="form-group">
                    <label for="exampleInputFile">Image upload</label>
                    <div class="input-group">
                        <div class="custom-file">
                            <input type="file" class="custom-file-input" id="exampleInputFile" name="my-file">
                            <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                        </div>
                        <div class="input-group-append">
                            <span class="input-group-text" id="">Upload</span>
                        </div>
                    </div>
                </div>

                <div class="card card-outline card-info">
                    <div class="card-header">
                        <h3 class="card-title">
                            Rich TextEditor
                        </h3>
                        <!-- tools box -->
                        <div class="card-tools">
                            <button type="button" class="btn btn-tool btn-sm" data-card-widget="collapse" data-toggle="tooltip"
                                    title="Collapse">
                                <i class="fas fa-minus"></i></button>
                            <button type="button" class="btn btn-tool btn-sm" data-card-widget="remove" data-toggle="tooltip"
                                    title="Remove">
                                <i class="fas fa-times"></i></button>
                        </div>
                        <!-- /. tools -->
                    </div>
                    <!-- /.card-header -->

                    <div class="card-body pad">
                        <div class="mb-3">
                            <textarea name="description" class="textarea" placeholder="Place some text here"
                                      style="width: 100%; height: 500px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;">
                            </textarea>
                        </div>

                    </div>
                </div>
                <button class="btn btn-outline-danger">Submit</button>
            </form>
        </div>
        <!-- /.col-->
    </div>
    <!-- ./row -->
</section>
<!-- /.content -->